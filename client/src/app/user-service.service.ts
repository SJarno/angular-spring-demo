import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from "./user";
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable()
export class UserServiceService {
  private userUrl!: string;

  constructor(private http: HttpClient) {
    this.userUrl = environment.baseUrl+"users";
   }
   public findAll(): Observable<User[]> {
     return this.http.get<User[]>(this.userUrl);
   }
   public save(user: User) {
     return this.http.post<User>(this.userUrl, user);
   }
}
