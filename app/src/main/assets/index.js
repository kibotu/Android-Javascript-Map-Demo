// [START maps_add_map]
// Initialize and add the map
function initMap() {
  // [START maps_add_map_instantiate_map]
  const check24 = { lat: 52.5111213, lng:13.4023262 };
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 17,
    center: check24,
  });
  // [END maps_add_map_instantiate_map]
  // [START maps_add_map_instantiate_marker]
  // The marker, positioned at Uluru
  const marker = new google.maps.Marker({
    position: check24,
    map: map,
  });
  // [END maps_add_map_instantiate_marker]
}
// [END maps_add_map]