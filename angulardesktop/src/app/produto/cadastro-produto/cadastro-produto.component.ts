import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-cadastro-produto',
  templateUrl: './cadastro-produto.component.html',
  styleUrls: ['./cadastro-produto.component.scss'],
})
export class CadastroProdutoComponent implements OnInit {

  onSubmit(f){
    console.log(f);
  }

  constructor(
  ) { }

  ngOnInit(){
  }


}
