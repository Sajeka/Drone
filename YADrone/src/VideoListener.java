//import java.awt.Graphics;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.image.BufferedImage;
//
//import javax.swing.JFrame;
//import javax.swing.SwingUtilities;
//
//import de.yadrone.base.ARDrone;
//import de.yadrone.base.command.VideoChannel;
//import de.yadrone.base.video.ImageListener;
//
//public class VideoListener extends JFrame {
//	 private BufferedImage image = null;
//	    
//	    public VideoListener(final ARDrone drone)
//	    {
//	        super("YADrone Tutorial");
//	        
//	        setSize(640,360);
//	        setVisible(true);
//	        
//	        drone.getVideoManager().addImageListener(new ImageListener() {
//	            public void imageUpdated(BufferedImage newImage)
//	            {
//	                image = newImage;
//	                SwingUtilities.invokeLater(new Runnable() {
//	                    public void run()
//	                    {
//	                        repaint();
//	                    }
//	                });
//	            }
//	        });
//	        
//	        addMouseListener(new MouseAdapter() {
//	            public void mouseClicked(MouseEvent e)
//	            {
//	                drone.getCommandManager().setVideoChannel(VideoChannel.NEXT);
//	            }
//	        });
//	        
//	        addWindowListener(new WindowAdapter() {
//	            public void windowClosing(WindowEvent e) 
//	            {
//	                drone.stop();
//	                System.exit(0);
//	            }
//	        });
//	    }
//	    
//	    public void paint(Graphics g)
//	    {
//	        if (image != null)
//	            g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
//	    }
//	    
//	    
//}
