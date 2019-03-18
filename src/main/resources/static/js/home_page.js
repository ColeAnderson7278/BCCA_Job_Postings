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

function testAllImages() {
    const images = document.querySelectorAll(".postImage");
    for (var img of images) {
        img.addEventListener("error", function() {
            img.src = "/images/no_image.png";
        });
    }
}

testAllImages();

function setAllDates() {
    const dateHolders = document.querySelectorAll(".postedDate");
    for (var holder of dateHolders) {
        var date = holder.innerText.split("-");
        holder.innerText =
            "Posted: " + setToMonth(date[1]) + " " + date[2] + ", " + date[0];
    }
}

setAllDates();

function setToMonth(num) {
    if (num == "01") {
        return "Jan";
    } else if (num == "02") {
        return "Feb";
    } else if (num == "03") {
        return "Mar";
    } else if (num == "04") {
        return "Apr";
    } else if (num == "05") {
        return "May";
    } else if (num == "06") {
        return "Jun";
    } else if (num == "07") {
        return "Jul";
    } else if (num == "08") {
        return "Aug";
    } else if (num == "09") {
        return "Sep";
    } else if (num == "10") {
        return "Oct";
    } else if (num == "11") {
        return "Nov";
    } else if (num == "12") {
        return "Dec";
    } else {
        return "Error";
    }
}
