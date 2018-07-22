package Entidades;




    public class Operadora  implements EntidadePersistivel {

        private int id;
        private String nome;
        private int idPlano;
        private int idIdades;

        public Operadora() {
        }

        public Operadora(int id, String nome, int idPlano, int idIdades) {
            super();
            this.id = id;
            this.nome = nome;
            this.idPlano = idPlano;
            this.idIdades = idIdades;

        }

        public int getIdIdades() {
            return idIdades;
        }

        public void setIdIdades(int idIdades) {
            this.idIdades = idIdades;
        }

        public int getIdPlano() {
            return idPlano;
        }

        public void setIdPlano(int idPlano) {
            this.idPlano = idPlano;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return  " Id: "+id  + nome +  "idPlano:" + idPlano + " idIdades:" + idIdades ;
        }






}
