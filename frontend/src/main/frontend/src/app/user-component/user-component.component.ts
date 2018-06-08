import { FtlUsers } from '../_models/FtlUsers.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-component',
  templateUrl: './user-component.component.html',
})
export class UserComponentComponent implements OnInit {

  uname: string;
  passwd: string;
  email: string;
  user: FtlUsers;
  
  constructor() { }

  ngOnInit() {
  }

}
