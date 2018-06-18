import { FtlUsers } from '../_models/FtlUsers.model';
import { UserComponentService } from './user-component.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-user-component',
  templateUrl: './user-component.component.html',
})
export class UserComponentComponent implements OnInit {

  uname: string;
  passwd: string;
  email: string;
  user: FtlUsers;
  
  allusers: FtlUsers[] = [];
  
  constructor(private userService: UserComponentService) { }

  ngOnInit() {
    this.userService.getAll().subscribe (value => {
      this.allusers = value;
    });
  }

}
