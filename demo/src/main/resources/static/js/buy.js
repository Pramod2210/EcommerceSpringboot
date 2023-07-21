  


  const stop =()=>{
    let num=confirm("Are you sure you want to cancel the payment?");
    
   if(num){
    alert("Payment canceled successfully!");
   }else {
    alert("Continue with your payment");
   }
  }

  const payment = () => {

   
   /*  let c=document.getElementById('country').value;
     let s=document.getElementById('state').value;
     let cit=document.getElementById('city').value;
     let p=document.getElementById('pin').value;
     let st=document.getElementById('stret').value;
     
     if(c.length>0 && s.length > 0 && cit.length>0 && p.length>0 && st.length >0){*/
    let result = confirm("Are you sure you want to continue with the payment?");
    if (result) {
      let otp;
      do {
        otp = prompt("Enter the 6-digit OTP");
        if (otp === "") {
          alert("Please enter the OTP");
        } else if (otp.length !== 6) {
          alert("Please enter a 6-digit OTP");
        }
      } while (otp === "" || otp.length !== 6);

      alert("Processing");
    } else {
      alert("Payment cancelled");
    }
  
  };
  
  

  
  