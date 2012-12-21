package estrutura.pratica_03;

import javax.swing.JOptionPane;

//Main da Prática 3 - Estrutura de Dados.
public class Main
{
	Stack alunos;
	Aluno t = null;
	public static void main(String args[])
	{
 		Main m = new Main();
 		m.entradaPilha();
 		m.testaPilha();
	}

	public Main()
	{
		this.alunos = new ArrayStack(5);
		//this.alunos = new LinkedStack(5);
	}

	public void entradaPilha()
	{
		 int i = 1;
		 while(true){
		 	String nome = JOptionPane.showInputDialog("Digite o nome do Aluno "+ i + ":");
		    if(nome.equals("0"))
		    	return;
		    ++i;

		    Aluno a = new Aluno();
		    a.setNome(nome);
		    try{
		    	alunos.push(a);
			}catch(FullStackException fse){
				fse.printStackTrace();
			}
		}
	}

	public void testaPilha()
	{
		System.out.println(alunos + "\n");

		System.out.println("Lendo do Topo da Pilha.");
		try{
			Aluno a = alunos.top();
			System.out.println("Aluno: " + a);
		}catch(Exception e){
			e.printStackTrace();
		}


		System.out.println("Desempilhando dois alunos da Pilha.");
		try{
			alunos.pop();
			alunos.pop();
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println("\n" + alunos + "\n");

		System.out.println("Empilhando aluno João.");
		Aluno j = new Aluno();
		j.setNome("João");
		try{
			alunos.push(j);
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println("\n" + alunos + "\n");
	}
}