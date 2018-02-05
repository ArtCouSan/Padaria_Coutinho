import { Produto } from './../model/produto';
import { Injectable } from '@angular/core';
import { Http, Response, Headers, URLSearchParams, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs';



@Injectable()
export class ProdutoServiceService {


  constructor(private http:Http) { 
  }

  addProduto(produto: Produto) {

  }


}
