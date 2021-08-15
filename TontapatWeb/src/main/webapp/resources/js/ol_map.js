/**
 * 
 */

var longs = document.getElementsByClassName("adresse-long");
var lats = document.getElementsByClassName("adresse-lat");
var names = document.getElementsByClassName("hidden-name");
var longTerrain = document.getElementById("hidden-terrain-long");
var latTerrain = document.getElementById("hidden-terrain-lat");

var vectorMarkers = new ol.source.Vector({});

for(var i=0; i < longs.length; i++)
	{var featureMarker = new ol.Feature({
  	geometry: new ol.geom.Point(ol.proj.fromLonLat([longs[i].textContent, lats[i].textContent])),
  	name: names[i].textContent,
  	  });
	
    vectorMarkers.addFeature(featureMarker);
}

var iconStyle = new ol.style.Style({
    image: new ol.style.Icon({
    anchor: [0.5, 46],
    anchorXUnits: 'fraction',
    anchorYUnits: 'pixels',
    src: '../resources/images/icons/map_red.png'
    })
});


var labelStyle = new ol.style.Style({
  text: new ol.style.Text({
    font: '12px Calibri,sans-serif',
    overflow: true,
    fill: new ol.style.Fill({
      color: '#000'
    }),
    stroke: new ol.style.Stroke({
      color: '#fff',
      width: 3
    }),
    offsetY: -12
  })
});
var style = [iconStyle, labelStyle];

var vectorMarkersLayer = new ol.layer.Vector({
    source: vectorMarkers,
    style: function(feature) {
        labelStyle.getText().setText(feature.get('name'));
        return style;
      }
	});
	
/* layer for terrain marker */
var vectorMarkerTerrain = new ol.source.Vector({});
var featureMarkerTerrain = new ol.Feature({
  		geometry: new ol.geom.Point(ol.proj.fromLonLat([longTerrain.textContent, latTerrain.textContent])),
  		name: "Mon terrain",
  	  	});
vectorMarkerTerrain.addFeature(featureMarkerTerrain);

var iconStyleTerrain = new ol.style.Style({
    image: new ol.style.Icon({
    anchor: [0.5, 46],
    anchorXUnits: 'fraction',
    anchorYUnits: 'pixels',
    src: '../resources/images/icons/map_green.png'
    })
});

var styleTerrain = [iconStyleTerrain, labelStyle];
var vectorMarkersLayerTerrain = new ol.layer.Vector({
    source: vectorMarkerTerrain,
    style: function(feature) {
        labelStyle.getText().setText(feature.get('name'));
        return styleTerrain;
      }
	});

/**
 * Elements that make up the popup.
 */
const container = document.getElementById('popup');
const content = document.getElementById('popup-content');
const closer = document.getElementById('popup-closer');

/**
 * Create an overlay to anchor the popup to the map.
 */
const overlay = new ol.Overlay({
  element: container,
  autoPan: true,
  autoPanAnimation: {
    duration: 250,
  },
});

/**
 * Add a click handler to hide the popup.
 * @return {boolean} Don't follow the href.
 */
closer.onclick = function () {
  overlay.setPosition(undefined);
  closer.blur();
  return false;
};


const map = new ol.Map({
    target: 'map',
	
    layers: [
    new ol.layer.Tile({
    	source: new ol.source.OSM(),
    	})    
	],
	overlays: [overlay],
    view: new ol.View({
      	center: ol.proj.fromLonLat([5.0414701, 47.3215806]),
      	zoom: 9
      	})
    });
    	

/**
 * Add a click handler to the map to render the popup.
 */
map.on('singleclick', function(evt) {
  var name = map.forEachFeatureAtPixel(evt.pixel, function(feature) {
    return feature.get('name');
  })
  if (name) {
    container.style.display = "block";
    var coordinate = evt.coordinate;
    content.innerHTML = name;
    overlay.setPosition(coordinate);
  } else {
    container.style.display = "none";
  }
});
map.on('pointermove', function(evt) {
  map.getTargetElement().style.cursor = map.hasFeatureAtPixel(evt.pixel) ? 'pointer' : '';
});


map.addLayer(vectorMarkersLayer);
map.addLayer(vectorMarkersLayerTerrain);
    	
calculateDistance([2.341110, 48.830620], [2.320160, 48.844970]);
function calculateDistance(src , dest ){
let finalmeasure = ol.sphere.getDistance(src , dest)/1000;
//let finalmeasure = Math.round(line.getLength() * 100) / 100; //for rounding
console.log(finalmeasure); //in Km
}