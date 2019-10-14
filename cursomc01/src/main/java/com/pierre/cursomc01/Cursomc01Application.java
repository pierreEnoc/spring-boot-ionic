package com.pierre.cursomc01;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pierre.cursomc01.domain.Categoria;
import com.pierre.cursomc01.domain.Cidade;
import com.pierre.cursomc01.domain.Cliente;
import com.pierre.cursomc01.domain.Endereco;
import com.pierre.cursomc01.domain.Estado;
import com.pierre.cursomc01.domain.ItemPedido;
import com.pierre.cursomc01.domain.Pagamento;
import com.pierre.cursomc01.domain.PagamentoComBoleto;
import com.pierre.cursomc01.domain.PagamentoComCartao;
import com.pierre.cursomc01.domain.Pedido;
import com.pierre.cursomc01.domain.Produto;
import com.pierre.cursomc01.domain.enums.EstadoPagamento;
import com.pierre.cursomc01.domain.enums.TipoCliente;
import com.pierre.cursomc01.repositories.CategoriaRepository;
import com.pierre.cursomc01.repositories.CidadeRepository;
import com.pierre.cursomc01.repositories.ClienteRepository;
import com.pierre.cursomc01.repositories.EnderecoRepository;
import com.pierre.cursomc01.repositories.EstadoRepository;
import com.pierre.cursomc01.repositories.ItemPedidoRepository;
import com.pierre.cursomc01.repositories.PagamentoRepository;
import com.pierre.cursomc01.repositories.PedidoRepository;
import com.pierre.cursomc01.repositories.ProdutoRepository;

@SpringBootApplication
public class Cursomc01Application implements CommandLineRunner{
     @Autowired
	 private CategoriaRepository categoriaRepository;
     @Autowired
 	private ProdutoRepository produtoRepository;
    
     @Autowired
 	private EstadoRepository estadoRepository;
 	@Autowired
 	private CidadeRepository cidadeRepository;
 	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;


	public static void main(String[] args) {
		SpringApplication.run(Cursomc01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
	}
     

