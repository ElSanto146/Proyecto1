import { HttpClient } from '@angular/common/http';
import { Injectable, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Habilidad } from '../model/habilidad';

@Injectable({
  providedIn: 'root'
})
export class HabilidadService {
  url='http://localhost:8080/habilidad/'

  constructor(private http:HttpClient) { } //minuto 26:25. En el minuto 30:43 se vé como poder reemplazar un palabra en todo el código

  public ver(): Observable<Habilidad[]>{ //trae Habilidad desde el modelo 
    return this.http.get<Habilidad[]>(this.url + 'ver');
  }

  public save(habilidad: Habilidad):Observable<any>{
    return this.http.post<any>(this.url + 'new', habilidad);
  }

  public delete(id: number): Observable<any>{
    return this.http.delete<any>(this.url + `delete/${id}`); 
    
  }


}
