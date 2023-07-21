
const login =()=>{
    let u=document.getElementById('user').value;
    let p= document.getElementById('pass').value;
    if(u.length>0 && p.length>0){
     let resp =alert("welcome In PBazzar Shopping !!");
     window.location.href="/";
    }
}


    

const forget=()=>{
    let e= document.getElementById('email').value;
let p= document.getElementById('pass').value;
    if(e.length > 0 && p.length>0){
    alert("OTP sent on Your Rejester Email");
    prompt("enter OTP");
}
}