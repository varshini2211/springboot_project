alert("Hi Hello");
const url = "http://localhost:8080/customer";

function getItems() {
    fetch(url)
    .then((response) => response.json())
    .then((data) => {
        console.log(data);
    })
    .catch((error) => {
        console.log('Error:', error);
    });
}

getItems();
