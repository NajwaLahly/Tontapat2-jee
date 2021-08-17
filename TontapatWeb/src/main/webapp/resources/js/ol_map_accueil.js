/**
 * 
 */
var longsOffres = document.getElementsByClassName("adresse-long-offre");
var latsOffres = document.getElementsByClassName("adresse-lat-offre");
var namesOffres = document.getElementsByClassName("hidden-name-offre");
var longsAnnonces = document.getElementsByClassName("adresse-long-annonce");
var latsAnnonces = document.getElementsByClassName("adresse-lat-annonce");
var namesAnnonces = document.getElementsByClassName("hidden-name-annonce");

var vectorMarkersOffres = new ol.source.Vector({});

for(var i=0; i < longsOffres.length; i++)
	{var featureMarker = new ol.Feature({
  	geometry: new ol.geom.Point(ol.proj.fromLonLat([longsOffres[i].textContent, latsOffres[i].textContent])),
  	name: namesOffres[i].textContent,
  	  });
	
    vectorMarkersOffres.addFeature(featureMarker);
}

var iconStyleOffres = new ol.style.Style({
    image: new ol.style.Icon({
    anchor: [0.5, 46],
    anchorXUnits: 'fraction',
    anchorYUnits: 'pixels',
    src: '../resources/images/icons/map_red.png'
    })
});

var styleOffres = [iconStyleOffres];

var vectorMarkersLayerOffres = new ol.layer.Vector({
    source: vectorMarkersOffres,
    style: function(feature) {
        return styleOffres;
      }
	});
	

var vectorMarkersAnnonces = new ol.source.Vector({});

for(var i=0; i < longsAnnonces.length; i++)
	{var featureMarker = new ol.Feature({
  	geometry: new ol.geom.Point(ol.proj.fromLonLat([longsAnnonces[i].textContent, latsAnnonces[i].textContent])),
  	name: namesAnnonces[i].textContent,
  	  });
    vectorMarkersAnnonces.addFeature(featureMarker);
}

var iconStyleAnnonces = new ol.style.Style({
    image: new ol.style.Icon({
    anchor: [0.5, 46],
    anchorXUnits: 'fraction',
    anchorYUnits: 'pixels',
    src: '../resources/images/icons/map_green.png'
    })
});

var styleAnnonces = [iconStyleAnnonces];
var vectorMarkersLayerAnnonces = new ol.layer.Vector({
    source: vectorMarkersAnnonces,
    style: function(feature) {
        return styleAnnonces;
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


 map.addLayer(vectorMarkersLayerOffres);  	
 map.addLayer(vectorMarkersLayerAnnonces);
