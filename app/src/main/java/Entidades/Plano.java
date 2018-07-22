package Entidades;

    public class Plano implements EntidadePersistivel {

        private int idPlano;
        private String nome_plano;

        public Plano() {

        }

        public Plano(int idPlano, String nome_plano) {
            super();
            this.idPlano = idPlano;
            this.nome_plano = nome_plano;


        }

        public int getidPlano() {
            return idPlano;
        }

        public void setidPlano(int idPlano) {
            this.idPlano = idPlano;
        }

        public String getnome_plano() {
            return nome_plano;
        }

        public void setnome_plano(String nome_plano) {
            this.nome_plano = nome_plano;
        }



        @Override
        public String toString() {
            return nome_plano + " " + "idPlano: "+idPlano;
        }

        @Override
        public int getId() {
            return getidPlano();
        }

        @Override
        public void setId(int id) {

        }
    }




