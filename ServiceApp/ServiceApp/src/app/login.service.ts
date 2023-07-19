import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  users:User[] =[
    new User("akshu", "12345"),
    new User("smarty", "12345"),
    new User("gupta", "12345")
  ];
  constructor() { }

  checkUsername(username:string, password:string)  : boolean
  {
    var chk=false;
    for(let i=0;i<this.users.length;i++)
    {
      if(this.users[i].username==username && this.users[i].password==password)
      {
        chk = true;
        break;
      }
    }
    return chk;
  }
}
