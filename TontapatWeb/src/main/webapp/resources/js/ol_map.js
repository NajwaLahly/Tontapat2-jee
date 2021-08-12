/**
 * 
 */


const iconFeature1 = new ol.Feature({
    geometry: new ol.geom.Point(ol.proj.fromLonLat([2.320160, 48.844970])),
	name: 'Tour Montparnasse',
    	});

const iconFeature2 = new ol.Feature({
  	geometry: new ol.geom.Point(ol.proj.fromLonLat([2.341110, 48.830620])),
  	name: 'Chez moi',
  	  });

    	const map = new ol.Map({
    	  target: 'map',
    	  layers: [
    	    new ol.layer.Tile({
    	      source: new ol.source.OSM(),
    	    }),
    	    new ol.layer.Vector({
      	      source: new ol.source.Vector({
      	      	features: [iconFeature1, iconFeature2]
      	      }),
      	      style: new ol.style.Style({
      	        image: new ol.style.Icon({
      	          anchor: [0.5, 46],
      	          anchorXUnits: 'fraction',
      	          anchorYUnits: 'pixels',
      	          src: 'https://openlayers.org/en/latest/examples/data/icon.png'
      	        })
      	      })
      	    })
    	  ],
    	  view: new ol.View({
      	    center: ol.proj.fromLonLat([2.320160, 48.844970]),
      	    zoom: 10
      	  })
    	});
    	
    	var points = [ [2.341110, 48.830620], [2.320160, 48.844970] ];

    	
    	points[0] = ol.proj.transform(points[0], 'EPSG:4326', 'EPSG:3857');
    	points[1] = ol.proj.transform(points[1], 'EPSG:4326', 'EPSG:3857');

    	
    	var featureLine = new ol.Feature({
    	    geometry: new ol.geom.LineString(points)
    	});

    	var vectorLine = new ol.source.Vector({});
    	vectorLine.addFeature(featureLine);

    	var vectorLineLayer = new ol.layer.Vector({
    	    source: vectorLine,
    	    style: new ol.style.Style({
    	        fill: new ol.style.Fill({ color: 'red', weight: 5 }),
    	        stroke: new ol.style.Stroke({ color: 'red', width: 3 })
    	    })
    	});
    	
    	map.addLayer(vectorLineLayer);

    	
    	calculateDistance([2.341110, 48.830620], [2.320160, 48.844970]);
    	function calculateDistance(src , dest ){
    	let finalmeasure = ol.sphere.getDistance(src , dest)/1000;
    	//let finalmeasure = Math.round(line.getLength() * 100) / 100; //for rounding
    	console.log(finalmeasure); //in Km
    	}