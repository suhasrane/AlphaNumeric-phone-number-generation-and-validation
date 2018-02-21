

function phonenumber()
{
  
	var inputtxt = document.getElementById("number2").value.toString();
  var phoneno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
  var phoneno2 = /^\(?([0-9]{3})\)?[-. ]?([0-9]{4})$/;
  console.log(123);
  console.log(inputtxt);
  if((inputtxt.match(phoneno)) ||(inputtxt.match(phoneno2)) )
        {
	  alert("valid phone number");
      return true;
        }
      else
        {
        alert("invalid phone number");
        return false;
        }
}