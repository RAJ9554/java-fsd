import { Component, OnInit, Inject } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  uname:string = ""
  pwd:string = "";
  msg:string = "";
//constructor(@Inject(LoginService) private logServ:LoginService) { }
  //or  
constructor(private logServ:LoginService) { }

  ngOnInit(): void {
  }

  LoginCheck()
  {
    if(this.logServ.checkUsername(this.uname, this.pwd)==true)
        this.msg = "Userexisted";
      else
        this.msg = "Invalid username/password";
  }
}
