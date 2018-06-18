import { FtlUsers } from '../_models/FtlUsers.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable()
export class UserComponentService {
  
  
  constructor(private http: HttpClient) {
    
  }
  
  getAll(): Observable<Array<FtlUsers>> {
    console.log("test this");
    return this.http.get<Array<FtlUsers>>('http://localhost:8080/user/all');
  }
  
}