package chapterTen.carbonFootPrint;

public enum PowerSource {
    AVERAGE_PERSON{
        public String toString(){
            return "Average Person";
        }
    }   ,
    AIR_FREIGHTED_ASPARAGUS{
        public String toString(){
            return "Air-freighted Asparagus";
        }
    },
    BACON{
        public String toString(){
            return "Bacon";
        }
    },
    BANANAS{
        public String toString(){
            return "Bananas";
        }
    },
    CEREALS_WITH_MILK{
        public String toString(){
            return "Cereals with milk";
        }
    },
    CHEESEBURGER{
        public String toString() {
            return "Cheeseburger";
        }
    };

}