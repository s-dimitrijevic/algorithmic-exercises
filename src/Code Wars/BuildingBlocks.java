public class BuildingBlocks {
    
    public static class Block{

        private int width;
        private int length;
        private int height;

	    public Block(int[] arr){
            this.width = arr[0];
            this.length = arr[1];
            this.height = arr[2];
        }

        public int getWidth(){
            return width;
        }

        public int getLength(){
            return length;
        }

        public int getHeight(){
            return height;
        }

        public double getVolume(){
            return length*width*height;
        }

        public double getSurfaceArea(){
            return 2*(length*height + length*width + width*height);
        }
    }
}
