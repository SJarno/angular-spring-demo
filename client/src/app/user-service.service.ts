import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from "./user";
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable()
export class UserServiceService {
  private userUrl!: string;

  constructor(private http: HttpClient) {
    /* get env base url */
    this.userUrl = environment.baseUrl+"users";
   }
   /* Get all users */
   public findAll(): Observable<User[]> {
     return this.http.get<User[]>(this.userUrl);
   }
   /* adds new user */
   public save(user: User) {
     /* User in body */
     return this.http.post<User>(this.userUrl, user);
   }
}
