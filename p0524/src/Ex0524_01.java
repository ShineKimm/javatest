
public class Ex0524_01 {

	public static void main(String[] args) {
		
		Point3D[] p3d = new Point3D[3];
		for(int i=0;i<3;i++) {
			p3d[i] = new Point3D();
		}
		
		p3d[0].p2d.x = 0;
		p3d[0].p2d.y = 0;
		p3d[0].z = 0;
		
		p3d[1].p2d.x = 10;
		p3d[1].p2d.y = 5;
		p3d[1].z = 3;
		
		p3d[2].p2d.x = 5;
		p3d[2].p2d.y = 40;
		p3d[2].z = 20;
	}
}
