class ParkingSystem {
    int [] arr = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        arr[0]=big;
        arr[1]=medium;
        arr[2]=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==3 && arr[2]-- >0)
            return true;
        else if(carType==2 && arr[1]-- >0)
            return true;
        else if(carType==1 && arr[0]-- >0)
            return true;
        
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */