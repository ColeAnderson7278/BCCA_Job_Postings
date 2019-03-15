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
