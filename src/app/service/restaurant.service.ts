import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Restaurant } from '../model/restaurant';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class RestaurantService {

  constructor(private http: HttpClient) { }
  saveProduct(rest:Restaurant):Observable<Object>{
    return this.http.post(`http://localhost:8080/rest/create`,rest);
  }
  getRest(){
    return this.http.get<Restaurant[]>(`http://localhost:8080/rest/all`);
  }
  deleteRest(id: number):Observable<Restaurant>{
    return this.http.delete<Restaurant>(`http://localhost:8080/rest/delete/${id}`);
  }


  getRestById(id: number): Observable<Restaurant> {
    return this.http.get<Restaurant>(`http://localhost:8080/rest/getbyid/${id}`);
  }

  saveUpdate(rest:Restaurant):Observable<Object>{
    return this.http.post("http://localhost:8080/rest/create",rest);
  }

  updateProduct(id:number,rest: Restaurant): Observable<Object> {
    return this.http.put(`http://localhost:8080/rest/update/${id}`,rest);
  }

}
