package Entidades;



    public class Faixaetaria implements EntidadePersistivel {

        private int idFaixaetaria;
        private int idIdades;
        private  int inicio;
        private int fim;

        public Faixaetaria() {
        }

        public Faixaetaria (int idFaixaetaria, int idIdades,int inicio, int fim) {
            super();
            this.idFaixaetaria = idFaixaetaria;
            this.idIdades = idIdades;
            this.inicio = inicio;
            this.fim = fim;


        }

        public int getIdFaixaetaria() {
            return idFaixaetaria;
        }

        public void setIdFaixaetaria(int idFaixaetaria) {
            this.idFaixaetaria = idFaixaetaria;
        }

        public int getIdIdades() {
            return idIdades;
        }

        public void setIdIdades(int idIdades) {
            this.idIdades = idIdades;
        }

        public int getInicio() {
            return inicio;
        }

        public void setInicio(int inicio) {
            this.inicio = inicio;
        }

        public int getFim() {
            return fim;
        }

        public void setFim(int fim) {
            this.fim = fim;
        }


        @Override
        public String toString() {
            return" IdFaixaetaria:"+ idFaixaetaria +" IdIdades:"+ idIdades +  "inicio:"+ inicio + " " + fim + " ";}


        @Override
        public int getId() {
            return idFaixaetaria;
        }

        @Override
        public void setId(int id) {

        }
    }



