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
