function checkDelete() {
    const form = document.querySelector("#deleteForm");
    const deleteBtn = document.querySelector("#deleteBtn");
    deleteBtn.addEventListener("click", function() {
        var boo = confirm("Are you sure you want to delete this post?");
        if (boo) {
            form.submit();
        } else {
            return false;
        }
    });
}
checkDelete();

function testImage() {
    const img = document.querySelector(".postImage");
    img.onerror = function() {
        img.src = "/images/no_image.png";
    };
}

testImage();
