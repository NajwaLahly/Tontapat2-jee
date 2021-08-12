/**
 * 
 */

var longs = document.getElementsByClassName("adresse-long");
var lats = document.getElementsByClassName("adresse-lat");

var vectorMarkers = new ol.source.Vector({});

for(var i=0; i < longs.length; i++)
	{var featureMarker = new ol.Feature({
  	geometry: new ol.geom.Point(ol.proj.fromLonLat([longs[i].textContent, lats[i].textContent])),
  	name: 'Chez moi',
  	  });
	
    vectorMarkers.addFeature(featureMarker);
}

var vectorMarkersLayer = new ol.layer.Vector({
    source: vectorMarkers,
    style: new ol.style.Style({
    	image: new ol.style.Icon({
    		anchor: [0.5, 46],
    		anchorXUnits: 'fraction',
    		anchorYUnits: 'pixels',
    		src: 'https://openlayers.org/en/latest/examples/data/icon.png'
    		})
		})
	});

const map = new ol.Map({
    target: 'map',
    layers: [
    new ol.layer.Tile({
    	source: new ol.source.OSM(),
    	})    
	],
    view: new ol.View({
      	center: ol.proj.fromLonLat([5.0414701, 47.3215806]),
      	zoom: 8
      	})
    });
    	

map.addLayer(vectorMarkersLayer);
    	
calculateDistance([2.341110, 48.830620], [2.320160, 48.844970]);
function calculateDistance(src , dest ){
let finalmeasure = ol.sphere.getDistance(src , dest)/1000;
//let finalmeasure = Math.round(line.getLength() * 100) / 100; //for rounding
console.log(finalmeasure); //in Km
}