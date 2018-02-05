import { Component, OnInit } from '@angular/core';
import { FormControl, FormBuilder, FormGroup } from '@angular/forms';
import { Http } from '@angular/http';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-cadastro-funcionario',
  templateUrl: './cadastro-funcionario.component.html',
  styleUrls: ['./cadastro-funcionario.component.scss']
})
export class CadastroFuncionarioComponent implements OnInit {

  formulario: FormGroup;

  constructor(
    private formBuilder: FormBuilder, private http: Http
  ) { }

  ngOnInit() {

    this.formulario = this.formBuilder.group({
      nome: [null],
      cpf: [null],
      nascimento: [null],
      sexoCombo: [null],
      senha: [null],
      passwordC: [null]
    });

  }


    onSubmit(){
      this.http.post('https://httpbin.org/post', JSON.stringify(this.formulario.value)).pipe(
        map(res => res)
      ).subscribe(dados => console.log(dados))
  
        this.formulario.reset();
      
      ;
    }

}
