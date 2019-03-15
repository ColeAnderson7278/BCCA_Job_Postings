function activateModal() {
    const modalButton = document.querySelector("#addCommentButton");
    const modal = document.querySelector("#commentModal");
    modalButton.addEventListener("click", function() {
        modal.style.display = "block";
    });
}
activateModal();

function deactivateModal() {
    const cancelButton = document.querySelector("#formCancelButton");
    const modal = document.querySelector("#commentModal");
    cancelButton.addEventListener("click", function() {
        clearInputs();
        modal.style.display = "none";
    });
}
deactivateModal();

function clearInputs() {
    const nameInput = document.querySelector("#nameInput");
    const commentInput = document.querySelector("#commentInput");
    nameInput.value = "";
    commentInput.value = "";
}

function checkForDelete() {
    const forms = document.querySelectorAll("#deleteCommentForm");
    for (var form of forms) {
        form.addEventListener("submit", function() {
            var boo = confirm("Are you sure you want to delete this comment?");
            if (boo) {
                form.submit();
            } else {
                return false;
            }
        });
    }
}

checkForDelete();
