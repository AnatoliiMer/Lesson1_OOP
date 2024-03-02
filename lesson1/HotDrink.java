package lesson1;

class HotDrink {
    private int name;
    private int volume;
    private int temperature;


    public int getName() {
            return name;
        }
    
    public void setName(int name) {
            this.name = name;
        }
    
    public int getVolume() {
            return volume;
        }
    
    public void setVolume(int volume) {
            this.volume = volume;
        }
    
    public int getTemperature() {
            return temperature;
        }
    
    public void setTemperature(int temperature) {
            this.temperature = temperature;
        }
    
    public HotDrink(int name, int volume, int temperature) {
            this.name = name;
            this.volume = volume;
            this.temperature = temperature;
        }
    }