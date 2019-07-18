<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Contact Form</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="resources/public/contact/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="resources/public/contact/css/style.css">
                
                
                <script src="resources/public/js/angular.js"></script>
        <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
	</head>
<!--contactid, name, mailaddress, message-->
        
	<body>

		<div class="wrapper">
			<div class="inner">
				<form action="">
                                    <!--contactid, name, mailaddress, message-->
					<h3>Contact Us</h3>
					<label class="form-group">
						<input type="text" class="form-control"  required>
						<span>Your Name</span>
						<span class="border"></span>
					</label>
					<label class="form-group">
						<input type="text" class="form-control"  required>
						<span for="">Your Mail</span>
						<span class="border"></span>
					</label>
					<label class="form-group" >
						<textarea name="" id="" class="form-control" required></textarea>
						<span for="">Your Message</span>
						<span class="border"></span>
					</label>
					<button>Submit 
						<i class="zmdi zmdi-arrow-right"></i>
					</button>
				</form>
			</div>
		</div>
		
	</body>
</html>