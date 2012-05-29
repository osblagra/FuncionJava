package funcions;

public class Classes {

	class Cotxe {
		/****	ATRIBUTS	****/
		int numBastidor;
		int preu;
		String matricula;
		private String marca;
		String model;
		String color;
		private boolean revisions[] = new boolean [5];
		
		/****	METODES		***/
		void setMatricula(String matricula) {this.matricula = matricula;}
		void setBastidor(int num) {this.numBastidor = num;}
		void setColor(String color) {this.color = color;}
		void setPreu(int preu) {this.preu = preu;}
		String getModel() {return this.model;}
		String getMarca() {return this.marca;}
		String getMatricula() {return this.matricula;}
		int getBastidor() {return this.numBastidor;}
		void agumentarPreu(int percentaje) {this.preu += (this.preu*percentaje)/100;}
		void setRevisio(int n) {
			if(n < revisions.length && n > 0) 
				this.revisions[n] = true;
			else
				Put.ln("Has exedit la quiantitat de revisions.");
		}
		
		void displayRevisio() {
			Put.ln("Index de les revisions.");
			for(int i = 0; i < revisions.length; i++)
				if(i < revisions.length-1)
					Put.noln("|  " + i + "  ");
				else
					Put.ln("|  " + i + "  |");
			for(int i = 0; i < revisions.length; i++)
				if(i < revisions.length-1)
					Put.noln(String.valueOf("|" + revisions[i]) + "");
				else
					Put.ln(String.valueOf("|" + revisions[i]) + "|");
		}
		
		void setCotxe(Cotxe c) {
			Put.noln("Matricula per a cotxe:\t");
			c.setMatricula(Read.Cad());
			Put.noln("Color:\t");
			c.setColor(Read.Cad());
			Put.noln("Preu:\t");
			c.setPreu(Read.Int());
		}
		
		void displayInfo() {
			Put.ln("\nMarca i model:\t" + this.marca + " " + this.model);
			Put.ln("Nº matricula:\t" + this.matricula);
			Put.ln("Nº bastidor:\t" + this.numBastidor);
			Put.ln("Color:\t" + this.color);
			Put.ln("Preu:\t" + this.preu);
			Put.ln("Revisions fetes:\t" + getQRevisio());
			this.displayRevisio();
		}
		
		int getQRevisio() {
			int con = 0;
			for(int i = 0; i < revisions.length; i++)
				if(revisions[i])
					con++;
			return con;
		}
		
		/****	CONSTRUCTORS	***/
		Cotxe(int bastidor, int preu, String matricula, String marca, String model, String color) {
			this.numBastidor = bastidor;
			this.preu = preu;
			this.color = color;
			this.marca = marca;
			this.model = model;
			this.matricula = matricula;
		}
		
		Cotxe(int bastidor, int preu, String marca, String model, String color) {
			this.numBastidor = bastidor;
			this.preu = preu;
			this.color = color;
			this.marca = marca;
			this.model = model;
			this.matricula = "";
		}
		
		Cotxe() {
			Put.noln("Marca del cotxe:\t");
			this.marca = Read.Cad();
			Put.noln("Model del cotxe:\t");
			this.model = Read.Cad();
			Put.noln("Nº bastidor:\t");
			this.numBastidor = Read.Int();
		}
	}
	
	class Cotxe2Ma extends Cotxe {
		/****	ATRIBUTS	****/
		int kms;
		
		/****	METODES		****/
		void setKms(int kms) {this.kms = kms;}
		int getKms() {return this.kms;}
		
		/****	CONSTRUCTOR		****/
		Cotxe2Ma(int kms) {
			super();
			Put.noln("Numero de kilometres:\t");
			this.kms = Read.Int();
		}
	}
}
