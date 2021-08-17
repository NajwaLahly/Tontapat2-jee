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

const map = new ol.Map({
    target: 'map',
	
    layers: [
    new ol.layer.Tile({
    	source: new ol.source.OSM(),
    	})    
	],
    view: new ol.View({
      	center: ol.proj.fromLonLat([5.0414701, 47.3215806]),
      	zoom: 9
      	})
    });

 map.addLayer(vectorMarkersLayerOffres);  	
 map.addLayer(vectorMarkersLayerAnnonces);
