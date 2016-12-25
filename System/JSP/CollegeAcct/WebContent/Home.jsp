<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>College Accountant | Accounting Software</title>
    <meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
	<link rel="stylesheet" href="css/zerogrid.css" type="text/css" media="all">
	 <link rel="stylesheet" href="css/responsive.css" type="text/css" media="all">
	 <link rel="stylesheet" href="css/responsiveslides.css" />   
    <script src="js/jquery-1.6.3.min.js" type="text/javascript"></script>
    <script src="js/cufon-yui.js" type="text/javascript"></script>
    <script src="js/cufon-replace.js" type="text/javascript"></script>
	<script src="js/Kozuka_Gothic_Pro_OpenType_300.font.js" type="text/javascript"></script>
    <script src="js/Kozuka_Gothic_Pro_OpenType_500.font.js" type="text/javascript"></script> 
    <script src="js/FF-cash.js" type="text/javascript"></script>      
    <script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="js/tms-0.3.js"></script>
	<script type="text/javascript" src="js/tms_presets.js"></script>
    <script src="js/jcarousellite_1.0.1.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/css3-mediaqueries.js"></script>
	<script src="js/responsiveslides.js"></script>
	
	
	<script>
    $(function () {
      $("#slider").responsiveSlides({
        auto: true,
        pager: false,
        nav: true,
        speed: 500,
        maxwidth: 940,
        namespace: "centered-btns"
      });
    });
  </script>
    <script type="text/javascript">
		$(document).ready(function() { 
			$('.carousel .jCarouselLite').jCarouselLite({ 
				btnNext: '.carousel .next',
				btnPrev: '.carousel .prev',
				speed: 600,
				easing: 'easeOutQuart',
				vertical: false,
				circular: true,
				visible: 4,
				start: 0,
				scroll: 1
			}); 
		}); 
	</script>
	
	 <script type="text/javascript">
	 
	 function validate()
	 {
		  
			 var mob = /^[1-9]{1}[0-9]{9}$/;
		   	 var txtMobile = document.getElementById(txtMobId);
		     if (document.home.studentId.value == "")
			 {
			    alert("Student Id can't be left blank !");
			    document.home.studentId.focus();
			    return false;
			 }
		 	 if (document.home.studentName.value == "")
			 {
		    	alert("Student Name can't be left blank !");
		    	document.home.studentName.focus();
		    	return false;
		 	}
		 	 
		 	 if (document.home.mobile.value == "")
			 {
			    alert("Mobile number can't be left blank !");
			    document.home.mobile.focus();
			    return false;
			 }
		 	 if (document.home.amount.value == "")
			 {
		    	alert("Amount can't be left blank !");
		    	document.home.amount.focus();
		    	return false;
		 	}
		 	 
		 	if (mob.test(document.home.mobile.value) == false) {
		        alert("Please enter valid mobile number.");
		        document.home.mobile.focus();
		        return false;
		    }
		 	
		 	if (isNaN(document.home.amount.value)) {
		 		  alert("The Amount field contains illegal characters.");
		 		  document.home.amount.value = "";
		 		  document.home.amount.focus();
		 		  return false;
		 		 }
	 
		 return true;
	 }
	 
	 </script>
	 
<link rel="icon" href="https://d1vq4cm585jne1.cloudfront.net/content/images/favicon-new.ico" type="image/x-icon">
<link rel="shortcut icon" href="https://d1vq4cm585jne1.cloudfront.net/content/images/favicon-new.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="https://d1vq4cm585jne1.cloudfront.net/content/images/apple-touch-icon-new.png">

<meta name ="robots" content="index,follow" />
<meta name="author"  content="Free Recharge, Online Recharge, Prepaid Recharge, Mobile Recharge, DTH Top ups"/>
<meta name="classification"  content="Free Online Recharge" />
<meta name="document-classification" content="Free Online Recharge" />
<meta name="alexaVerifyID" content="_ld1uhM6KiPm6ru7cNPKE2MvpTg" />
        <meta name="description" content="Easy & FREE Recharge service for prepaid mobile, DTH and data card. Instant Recharge for all Mobile and DTH operators using credit card, debit card, net banking and cash card. Get FREE COUPONS & offers of equal and higher value.">
        <meta name="keywords" content="Online Recharge,Mobile Recharge,Prepaid Recharge,Airtel,Vodafone,BSNL,Reliance,Docomo,Idea,Aircel,Free Online mobile recharge, free refill, free talk time, free prepaid mobile recharge,Free E-recharge, easy & instant mobile recharge, online recharge vouchers, online top up & Recharge airtel, free vodafone prepaid mobile recharge, reliance top up online, idea online top up, tata indicom prepaid top up, bsnl mobile recharge, docomo, aircel, videocon, loop, uninor, mts, s tel recharge & top up services">
    
        <script>
            (function(_,e,rr,s){_errs=[s];var c=_.onerror;_.onerror=function(){var a=arguments;_errs.push(a);
                c&&c.apply(this,a)};var b=function(){var c=e.createElement(rr),b=e.getElementsByTagName(rr)[0];
                c.src="//beacon.errorception.com/"+s+".js";c.async=!0;b.parentNode.insertBefore(c,b)};
                _.addEventListener?_.addEventListener("load",b,!1):_.attachEvent("onload",b)})
                    (window,document,"script","51df8e9c6fdb191b3e000003");
        </script>
        
<link href="https://d2s1ih2yipot4l.cloudfront.net/content/css/bootstrap.3.0.3.min.css?v=23f5fdee07f1269c90c1254f58bab3ba5234862f" rel="stylesheet" type="text/css" >
<link href="https://d2s1ih2yipot4l.cloudfront.net/content/css/base.css?v=23f5fdee07f1269c90c1254f58bab3ba5234862f" rel="stylesheet" type="text/css" >
<link href="https://d2s1ih2yipot4l.cloudfront.net/content/css/layoutNew.css?v=23f5fdee07f1269c90c1254f58bab3ba5234862f" rel="stylesheet" type="text/css" >
<link href="https://d2s1ih2yipot4l.cloudfront.net/content/css/custom.css?v=23f5fdee07f1269c90c1254f58bab3ba5234862f" rel="stylesheet" type="text/css" >
<link href="https://d2s1ih2yipot4l.cloudfront.net/content/css/payment-new.css?v=23f5fdee07f1269c90c1254f58bab3ba5234862f" rel="stylesheet" type="text/css" >
<link href="https://d2s1ih2yipot4l.cloudfront.net/content/css/jquery.fancybox.css?v=23f5fdee07f1269c90c1254f58bab3ba5234862f" rel="stylesheet" type="text/css" >
<link href="https://d2s1ih2yipot4l.cloudfront.net/content/css/tipped.css?v=23f5fdee07f1269c90c1254f58bab3ba5234862f" rel="stylesheet" type="text/css" >

    
<script type="text/javascript" src="https://d2s1ih2yipot4l.cloudfront.net/content/js/jquery-1.8.2.min.js"></script>

<script type="text/javascript">
    $.ajaxSetup({
        beforeSend:function(xhr){
            xhr.setRequestHeader('csrfRequestIdentifier', '4894cfff-bfd5-465d-9c22-1a93c8a87670');
        }
    });

    $(document).ready(function(ev){
        $.getScript('/tracker.js?v=0');
    });

    var _fcTrackerEventQueue = _fcTrackerEventQueue || [];
    
    function fcTrack(params) {
        _fcTrackerEventQueue.push(params);
    }
</script>
</head>
<body id="home">
<!--==============================header=================================-->
     <header>
    	<div class="menu-row">
        	<div class="main zerogrid">
            	<nav class="wrapper">
                    <ul class="menu">
                        
                    </ul>
                </nav>
            </div>
        </div>
    	<div class="row-bot">
            <div class="row-bot-bg">
                <div class="main zerogrid">
                    <div class="wrapper p6">
                        <h1><a href="index.html"><img src="images/logo.png" /></a></h1>
                        <h2>Accounting Software</h2>
                    </div>
                </div>
            </div>
        </div>
    </header>
       




<!--==============================content================================-->
   <section id="content">
        <div class="main zerogrid">
               
                    <article class="col-1-3"><div class="wrap-col">
                    	<div class="indent-left">
                    <form action="homePage" name="home" method="post">
					<table>
					<tr>
					<td><font face="verdana" size="2px"></font>Student ID:</td>
					<td><input type="text" name="studentId" ></td>
					</tr>
					
					<tr>
					<td><font face="verdana" size="2px"></font>Name:</td>
					<td><input type="text" name="studentName"></td>
					</tr>
					
					<tr>
					<td><font face="verdana" size="2px"></font>Mobile:</td>
					<td><input type="text" name="mobile" id = "txtMobId"></td>
					</tr>
					
					
					<tr>
					<td><font face="verdana" size="2px"></font>Amount:</td>
					<td><input type="text" name="amount"></td>
					</tr>
					
					<tr>
					<td></td>
					<td><input type="submit" value="submit" onclick="return validate();"></td>
					</tr>
					</table>
							
							 
					</form>
							
                        </div>
                    </div></article>
                   
                </div>
                
                
                <div id="allPaymentOpt" class="other-payments">
        
            <div class="sub-head">
                <h3> Payment options</h3>
                <hr />
            </div>
        
        <div class="tabsFour tab selectPayment clearfix"  >

        <ul id="paymenttab" class="tabTitle vertTab">
            
                 
                    <li>
                        <a href="javascript:void(0)" rel="0" class="payment-option" data-payment-type="Debit Card">
                                Debit Card
                            <span class="rtArw" >&nbsp;</span>
                        </a>
                    </li>
                
            
                 
                    <li>
                        <a href="javascript:void(0)" rel="1" class="payment-option" data-payment-type="Credit Card">
                                Credit Card
                            <span class="rtArw" >&nbsp;</span>
                        </a>
                    </li>
                
            
                 
                    <li>
                        <a href="javascript:void(0)" rel="2" class="payment-option" data-payment-type="Net Banking">
                                Net Banking
                            <span class="rtArw" >&nbsp;</span>
                        </a>
                    </li> 
                
            
        </ul>
        <div id="payment-options-content" class="tabsFour_content form clearfix">
        

         

        <div class="tab_contentFour unit">
        <form name="Debit Card" action="https://www.freecharge.in/checkout/pay/dopayment.htm" method="post" id="Debit-Card">
        <input type="hidden" name="paymenttype" id="2-paymenttype" value="2" />
        <input type="hidden" name="productId" id="2-productId" value="1" />
        <input type="hidden" name="affiliateid" id="2-affiliateid" value="1" />
        <input type="hidden" name="lookupID" id="2-lookupID" value="e9c67903-11a8-4f1c-b5f8-c7622d3ad907" />
        <input type="hidden" name="cartId" id="2-cartId" value="" />
 

        

            <div class="payment-type-info">
                <p>
                    <span>Pay using your debit card.</span>
                    <span>(Cards issued in India only)</span>
                    <img src="https://d1vq4cm585jne1.cloudfront.net/content/images/icons/fc-debit-cards.png" />
                </p>
            </div>


            


            


            <div id="seamless-debit-payment">
                <h5>Enter your debit card details <em>(Required fields are marked with <strong class="red">*</strong>)</em></h5>
                <div class="seamless-payment seamless-payment-debit clearfix form">
                    <div class="section card-type">
                        <label>Card type<strong class="red">*</strong></label>
                        <select id="seamless-debit" name="paymentoption" onchange="selectSeamlessDebit(this.value)" class="validate[required]">
                            <option value="">Select</option>
                            <option value="DMC">Mastercard</option>
                            <option value="DVI">Visa</option>
                            <option value="DCME">Maestro</option>
                            <option value="DSME">SBI Maestro</option>
                        </select>
                    </div>

                    <div class="section card-number">
                        <label>Card number<strong class="red" >*</strong></label>
                        <input autocomplete="on" type="text" onkeypress="return isNumberKey(event)" id="dbNum" maxlength="19" class="validate[required,custom[onlyNumberSp],funcCall[cardValidTest]] input"   />
                    </div>
                    <div id="dbNumOfferAlert"></div>

                    <div class="section card-name">
                        <label>Name on card<strong class="red" >*</strong></label>
                        <input type="text" id="dbHolderName" class="validate[required,custom[onlyLetterSp]] input"  />
                    </div>

                    <div class="section expiry-date">
                        <label>Expiry date<strong class="red">*</strong></label>
                        <select id="dbExpMon" class="validate[required]" >
                            <option value="" > Month </option>
                            <option> 01 </option>
                            <option> 02 </option>
                            <option> 03 </option>
                            <option> 04 </option>
                            <option> 05 </option>
                            <option> 06 </option>
                            <option> 07 </option>
                            <option> 08 </option>
                            <option> 09 </option>
                            <option> 10 </option>
                            <option> 11 </option>
                            <option> 12 </option>
                        </select>
                        <select id="dbExpYear"  class="validate[required,funcCall[cardExpiryValidation]]">
                            <option value=""> Year </option>
                            <option> 2014 </option>
                            <option> 2015 </option>
                            <option> 2016 </option>
                            <option> 2017 </option>
                            <option> 2018 </option>
                            <option> 2019 </option>
                            <option> 2020 </option>
                            <option> 2021 </option>
                            <option> 2022 </option>
                            <option> 2023 </option>
                            <option> 2024 </option>
                            <option> 2025 </option>
                            <option> 2026 </option>
                            <option> 2027 </option>
                            <option> 2028 </option>
                            <option> 2029 </option>
                            <option> 2030 </option>
                            <option> 2031 </option>
                            <option> 2032 </option>
                            <option> 2033 </option>
                            <option> 2034 </option>
                            <option> 2035 </option>
                            <option> 2036 </option>
                            <option> 2037 </option>
                            <option> 2038 </option>
                            <option> 2039 </option>
                            <option> 2040 </option>
                            <option> 2041 </option>
                            <option> 2042 </option>
                            <option> 2043 </option>
                            <option> 2044 </option>
                            <option> 2045 </option>
                            <option> 2046 </option>
                            <option> 2047 </option>
                            <option> 2048 </option>
                        </select>
                    </div>
                    <div class="section cvv-number">
                        <label>CVV2/CVC2 number<strong class="red" >*</strong></label>
                        <input autocomplete="off" type="password" id="dbCvv" onkeypress="return isNumberKey(event,3,id)" maxlength="3" class="validate[required,funcCall[cvvValid]]"  />
                        <span><em>The 3 digit number printed on the back of the card</em></span>
                    </div>

                    

                </div>
            </div>
			
			<p class="payment-instruction">In order to protect your card from fraudulent transactions we might redirect you to partner site,  which will verify your card information, before we proceed with the payment.</p>
                
         
    </section>



<!--==============================footer=================================-->
    <footer>
        <div class="main zerogrid">
        	<div class="aligncenter">
            	<p class="p0">Copyright © 2014, CollegeAccountant. </p>
                Designed by: <a href="" target="_blank">Dilip_dmk</a>
            </div>
        </div>
    </footer>
	<script type="text/javascript"> Cufon.now(); </script>
</body>
 

</body>
</html>