function listenForSearch() {
    const searchBar = document.querySelector("#searchBar");
    searchBar.addEventListener("input", function() {
        searchApplications();
    });
}

listenForSearch();

function searchApplications() {
    var searchInput = document.querySelector("#searchBar").value.toLowerCase();
    var posts = document.querySelectorAll(".postDivLink");
    for (const post of posts) {
        var name = post
            .querySelector(".postCompanyName")
            .innerText.toLowerCase();
        var position = post
            .querySelector(".postPosition")
            .innerText.toLowerCase();
        if (name.includes(searchInput) || position.includes(searchInput)) {
            post.classList.remove("hidden");
        } else {
            post.classList.add("hidden");
        }
    }
}
