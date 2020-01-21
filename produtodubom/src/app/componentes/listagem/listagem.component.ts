import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/app/model/Produto';
import { ProdutoService } from 'src/app/services/produto.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listagem',
  templateUrl: './listagem.component.html',
  styleUrls: ['./listagem.component.css']
})
export class ListagemComponent implements OnInit {

  lista: Produto[];

  constructor(private srv: ProdutoService, private route: Router) { }

  ngOnInit() {
    if (localStorage.getItem("wesToken")) {
      this.srv.getAllProdutos().subscribe(
        (res: Produto[]) => {
          this.lista = res;
        },
        (err) => {
          this.route.navigate(['/inicio']);
        }
      );
    }
    else {
      this.route.navigate(['/inicio']);
    }
  }

}
