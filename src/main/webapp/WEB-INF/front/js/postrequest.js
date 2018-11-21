$(document).ready(
    function () {

        // SUBMIT FORM
        $("#myForm").submit(function (event) {
            // Prevent the form from submitting via the browser.
            event.preventDefault();
            ajaxPost();
        });

        function ajaxPost() {

            // PREPARE FORM DATA
            var formData = {
                name: $("#user_name").val(),
                email: $("#user_email").val(),
                phone: $("#user_phone").val(),
                message: $("#user_message").val()
            }

            // DO POST
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: window.location + "save",
                data: JSON.stringify(formData),
                dataType: 'json',
                success: function (result) {
                    if (result.status == "success") {
                        $("#postResultDiv").html(
                            "" + result.data.name
                            + "Post Successfully! <br>"
                            + "---> Congrats !!" + "</p>");
                    } else {
                        $("#postResultDiv").html("<strong>Error</strong>");
                    }
                    console.log(result);
                },
                error: function (e) {
                    alert("Error!")
                    console.log("ERROR: ", e);
                }
            });

        }

    })