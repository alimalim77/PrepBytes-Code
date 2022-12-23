class PrepBytes extends Thread{
    
    public void run(){
        System.out.println("Thread runs");
    }
    public static void main(String[] args){
        PrepBytes pb = new PrepBytes();
        pb.run();
    }
}
