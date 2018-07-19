int xx=0;
int yy=0;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {                                     
       xx=evt.getX();
       yy=evt.getY();  
    }                                    

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {                                     
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       this.setLocation(x-xx, y-yy);
    }  
