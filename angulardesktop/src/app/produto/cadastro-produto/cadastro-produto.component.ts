import { ProdutoServiceService } from './../services/produto-service.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormBuilder, FormGroup,  Validators } from '@angular/forms';
import { Http } from '@angular/http';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-cadastro-produto',
  templateUrl: './cadastro-produto.component.html',
  styleUrls: ['./cadastro-produto.component.scss'],
})
export class CadastroProdutoComponent implements OnInit {

  formulario: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private http: Http,
    private service: ProdutoServiceService  ) { }

  ngOnInit(){

    this.formulario = this.formBuilder.group({
      codigoBarras: [null, [Validators.required, Validators.maxLength(100)]],
      nome: [null, [Validators.required,  Validators.maxLength(100)]],
      marcaAdd: [null, [Validators.required,  Validators.maxLength(100)]],
      categoriaAdd: [null, [Validators.required, Validators.maxLength(100)]],
      preco: [null, [Validators.required]],
      qtnComprada: [null, [Validators.required]],
      descricao: [null, [Validators.required, Validators.maxLength(500)]]
    });

  }

  onSubmit(){
    this.http.post('https://httpbin.org/post', JSON.stringify(this.formulario.value)).pipe(
      map(res => res)
    ).subscribe(dados => console.log(dados))
      
      this.formulario.reset();
    
    ;
  }

  verificaValidTouched(campo){
    return !this.formulario.get(campo).valid && this.formulario.get(campo).touched;
  }

  aplicaCssErro(campo){
    return{
      'is-invalid': this.verificaValidTouched(campo),
    }
  }

}
