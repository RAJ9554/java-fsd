import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  username:string = "";
  password:string = "";
  msg:string = "";


  LoginCheck()
  {
    if(this.username=="venugopal"  &&  this.password=="12345")
        this.msg = "Login Successfull";
    else
        this.msg = "Please check username / password";
  }
}
