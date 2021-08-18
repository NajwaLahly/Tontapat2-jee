/**
 * 
 */
var offres = document.getElementsByClassName("map-offres");
var offresNodes = Array.prototype.slice.call(
  document.getElementsByClassName("map-offres")
);
var offresCoords = document.getElementsByClassName("offre-coords");

var annonces = document.getElementsByClassName("map-annonces");
var annoncesNodes = Array.prototype.slice.call(
  document.getElementsByClassName("map-annonces")
);
var annoncesCoords = document.getElementsByClassName("annonce-coords");

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

for (var i = 0; i < offres.length; i++) {
  offres[i].addEventListener("mouseenter", focusMapMarker);
  offres[i].addEventListener("mouseleave", unFocusMapMarker);
}

for (var i = 0; i < annonces.length; i++) {
  annonces[i].addEventListener("mouseenter", focusMapMarkerAnnonce);
  annonces[i].addEventListener("mouseleave", unFocusMapMarkerAnnonce);
}

function focusMapMarker(e) {
  offreIdx = offresNodes.indexOf(e.target);
  offre = offresCoords[offreIdx];

  map.getLayers().forEach(function (layer) {
    //If this is actually a group, we need to create an inner loop to go through its individual layers
    if (layer instanceof ol.layer.Group) {
      layer.getLayers().forEach(function (groupLayer) {
        //If this is a vector layer, add it to our extent
        if (layer instanceof ol.layer.Vector)
          console.log(groupLayer.getSource().getExtent());
      });
    } else if (layer instanceof ol.layer.Vector) {
      features = layer
        .getSource()
        .getFeatures()
        .forEach(function (f) {
          flatCoords = f.getGeometry().getCoordinates();
          coords = ol.proj.transform(flatCoords, "EPSG:3857", "EPSG:4326");

          if (
            coords[0].toFixed(2) ==
              parseFloat(offre.children[0].textContent).toFixed(2) &&
            coords[1].toFixed(2) ==
              parseFloat(offre.children[1].textContent).toFixed(2)
          ) {
            f.setStyle(iconStyleOffresFocused);
          }
        });
    }
  });
}

function unFocusMapMarker(e) {
  offreIdx = offresNodes.indexOf(e.target);
  offre = offresCoords[offreIdx];

  map.getLayers().forEach(function (layer) {
    //If this is actually a group, we need to create an inner loop to go through its individual layers
    if (layer instanceof ol.layer.Group) {
      layer.getLayers().forEach(function (groupLayer) {
        //If this is a vector layer, add it to our extent
        if (layer instanceof ol.layer.Vector)
          console.log(groupLayer.getSource().getExtent());
      });
    } else if (layer instanceof ol.layer.Vector) {
      features = layer
        .getSource()
        .getFeatures()
        .forEach(function (f) {
          flatCoords = f.getGeometry().getCoordinates();
          coords = ol.proj.transform(flatCoords, "EPSG:3857", "EPSG:4326");

          if (
            coords[0].toFixed(2) ==
              parseFloat(offre.children[0].textContent).toFixed(2) &&
            coords[1].toFixed(2) ==
              parseFloat(offre.children[1].textContent).toFixed(2)
          ) {
            f.setStyle(iconStyleOffres);
          }
        });
    }
  });
}

function focusMapMarkerAnnonce(e) {
  annonceIdx = annoncesNodes.indexOf(e.target);
  annonce = annoncesCoords[annonceIdx];

  map.getLayers().forEach(function (layer) {
    //If this is actually a group, we need to create an inner loop to go through its individual layers
    if (layer instanceof ol.layer.Group) {
      layer.getLayers().forEach(function (groupLayer) {
        //If this is a vector layer, add it to our extent
        if (layer instanceof ol.layer.Vector)
          console.log(groupLayer.getSource().getExtent());
      });
    } else if (layer instanceof ol.layer.Vector) {
      features = layer
        .getSource()
        .getFeatures()
        .forEach(function (f) {
          flatCoords = f.getGeometry().getCoordinates();
          coords = ol.proj.transform(flatCoords, "EPSG:3857", "EPSG:4326");

          if (
            coords[0].toFixed(2) ==
              parseFloat(annonce.children[0].textContent).toFixed(2) &&
            coords[1].toFixed(2) ==
              parseFloat(annonce.children[1].textContent).toFixed(2)
          ) {
            f.setStyle(iconStyleAnnoncesFocused);
          }
        });
    }
  });
}

function unFocusMapMarkerAnnonce(e) {
  annonceIdx = annoncesNodes.indexOf(e.target);
  annonce = annoncesCoords[annonceIdx];

  map.getLayers().forEach(function (layer) {
    //If this is actually a group, we need to create an inner loop to go through its individual layers
    if (layer instanceof ol.layer.Group) {
      layer.getLayers().forEach(function (groupLayer) {
        //If this is a vector layer, add it to our extent
        if (layer instanceof ol.layer.Vector)
          console.log(groupLayer.getSource().getExtent());
      });
    } else if (layer instanceof ol.layer.Vector) {
      features = layer
        .getSource()
        .getFeatures()
        .forEach(function (f) {
          flatCoords = f.getGeometry().getCoordinates();
          coords = ol.proj.transform(flatCoords, "EPSG:3857", "EPSG:4326");

          if (
            coords[0].toFixed(2) ==
              parseFloat(annonce.children[0].textContent).toFixed(2) &&
            coords[1].toFixed(2) ==
              parseFloat(annonce.children[1].textContent).toFixed(2)
          ) {
            f.setStyle(iconStyleAnnonces);
          }
        });
    }
  });
}


var iconStyleOffres = new ol.style.Style({
    image: new ol.style.Icon({
    anchor: [0.5, 46],
    anchorXUnits: 'fraction',
    anchorYUnits: 'pixels',
    src: 'resources/images/icons/map_red.png'
    })
});

var iconStyleOffresFocused = new ol.style.Style({
    image: new ol.style.Icon({
    anchor: [0.5, 46],
    anchorXUnits: 'fraction',
    anchorYUnits: 'pixels',
	scale: 1.5,
    src: 'resources/images/icons/map_red.png'
    })
});

var iconStyleAnnoncesFocused = new ol.style.Style({
    image: new ol.style.Icon({
    anchor: [0.5, 46],
    anchorXUnits: 'fraction',
    anchorYUnits: 'pixels',
	scale: 1.5,
    src: 'resources/images/icons/map_green.png'
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
    src: 'resources/images/icons/map_green.png'
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
