import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class ConqueringOfNewEarth extends Canvas
{

    int[] starx = new int [25];
    int[] stary = new int [25];
    Font title = new Font ("Comic Sans MS", Font.BOLD, 35);
    Font intro = new Font ("Comic Sans MS", Font.PLAIN, 20);
    int op = 0;
    int instructions = 1;
    int charselect = 0;
    int bodyselect = 0;
    int myX = 405;
    int myY = 650;
    int hp = 200;
    int water = 0;
    int hit = 0;
    int waterx = 600;
    int watery = 500;
    int waterz = 5;
    int frog = 0;
    int frog1x = 200;
    int frog1y = 300;
    int r1 = (int) (Math.random () * 255);
    int g1 = (int) (Math.random () * 255);
    int b1 = (int) (Math.random () * 255);
    int r2 = 255 - r1;
    int g2 = 255 - g1;
    int b2 = 255 - b1;
    Color froggo1 = new Color (r1, g1, b1);
    Color froggo2 = new Color (r2, g2, b2);
    int level = 0;
    int stage1 = 1;
    int stage2 = 1;
    int stage3 = 1;
    int wingame = 0;
    int losegame = 0;
    int losestage = 0;
    Font stage = new Font ("Arial Black", Font.PLAIN, 60);
    Font stuff = new Font ("Arial Black", Font.PLAIN, 30);

    int[] enemyx = {50, 50, 120};
    int[] enemyy = {200, 280, 280};
    int[] enemyrange = {250, 200, 180};
    int[] enemysize = {70, 50, 30};
    int[] enemystr1 = {5, 6, 7};
    int[] enemydiag1 = {3, 4, 5};
    int[] enemystr2 = {7, 9, 11};
    int[] enemydiag2 = {5, 7, 9};

    Color pinku = new Color (255, 82, 128); // pink
    Color otherleaf = new Color (68, 255, 31); // blip green
    Color df = new Color (30, 14, 130); // bloop dark flower
    Color lf = new Color (50, 115, 219); // bloop light flower
    Color blob = new Color (237, 232, 250); // bloop blob
    Color dy = new Color (252, 220, 93); // dark yellow
    Color ly = new Color (252, 237, 164); // light yellow
    Color leaf = new Color (7, 184, 31); // leaf green

    int[] rockx = {105, 565, 155, 455};
    int[] rocky = {565, 515, 365, 215};
    int[] treex = {355, 705, 95, 505};
    int[] treey = {475, 375, 325, 625};

    Color sg = new Color (230, 230, 230); // space grey
    Color hg = new Color (181, 181, 181); // helmet grey
    Color shg = new Color (69, 69, 69); // shoe grey
    Color p = new Color (255, 236, 199); // peach

    Color body = new Color (230, 230, 230);
    Color visor = new Color (181, 181, 181);

    // colour options

    Color opt1 = new Color (235, 113, 133); // pink
    Color opt2 = new Color (255, 153, 153); //red
    Color opt3 = new Color (255, 204, 102); //orange
    Color opt4 = new Color (255, 255, 153); //yellow
    Color opt5 = new Color (204, 255, 153); //green
    Color opt6 = new Color (83, 243, 200); // cyan
    Color opt7 = new Color (204, 255, 255); //blue
    Color opt8 = new Color (204, 204, 255); //purple

    Color rock = new Color(150,150,150); // rock colour
    Color bushy = new Color(56,155,123); // leafy part

    public ConqueringOfNewEarth ()
    {
	setSize (new Dimension (800, 700));
	addKeyListener (new KeyAdapter ()
	{
	    //@Override
	    public void keyPressed (KeyEvent evt)
	    {
		moveIt (evt);
	    }
	}
	);
    }


    public void paint (Graphics g)
    {
	if (op == 0)
	{
	    for (int i = 0 ; i <= 24 ; i++)
	    {
		starx [i] = (int) (Math.random () * 800);
	    }
	    for (int i = 0 ; i <= 24 ; i++)
	    {
		stary [i] = (int) (Math.random () * 700);
	    }
	    opening (g, title, intro, starx, stary);
	    op = 1;
	}

    if (charselect == 0)
	{
	    g.setColor (Color.gray);
	    g.fillRect (0, 0, 5000, 5000);
	    g.setColor (opt1);
	    g.fillRect (5, 450, 100, 100);
	    g.fillRect (5, 250, 100, 100);
	    g.setColor (opt2);
	    g.fillRect (105, 450, 100, 100);
	    g.fillRect (105, 250, 100, 100);
	    g.setColor (opt3);
	    g.fillRect (205, 450, 100, 100);
	    g.fillRect (205, 250, 100, 100);
	    g.setColor (opt4);
	    g.fillRect (305, 450, 100, 100);
	    g.fillRect (305, 250, 100, 100);
	    g.setColor (opt5);
	    g.fillRect (405, 450, 100, 100);
	    g.fillRect (405, 250, 100, 100);
	    g.setColor (opt6);
	    g.fillRect (505, 450, 100, 100);
	    g.fillRect (505, 250, 100, 100);
	    g.setColor (opt7);
	    g.fillRect (605, 450, 100, 100);
	    g.fillRect (605, 250, 100, 100);
	    g.setColor (opt8);
	    g.fillRect (705, 450, 100, 100);
	    g.fillRect (705, 250, 100, 100);
	    g.setColor (Color.white);
	    g.fillRect (340, 50, 130, 100);
	    g.setColor (Color.black);
	    g.setFont (stuff);
	    g.drawString ("FINISH", 350, 85);
	    g.drawString ("Use arrow keys", 5, 30);
	    g.drawString ("to move", 45, 60);
	    g.drawString ("Create your", 5, 110);
	    g.drawString ("character", 45, 140);
	    g.drawString ("Visor", 5, 245);
	    g.drawString ("Suit", 5, 445);

	    if (myX < 15)
		myX = 15;
	    if (myX > 790)
		myX = 790;
	    if (myY < 125)
		myY = 125;
	    if (myY > 690)
		myY = 690;

	    if ((myX >= 0) && (myX < 105) && (myY > 450) && (myY < 550))
		body = opt1;
	    else if ((myX >= 105) && (myX < 205) && (myY > 450) && (myY < 550))
		body = opt2;
	    else if ((myX >= 205) && (myX < 305) && (myY > 450) && (myY < 550))
		body = opt3;
	    else if ((myX >= 305) && (myX < 405) && (myY > 450) && (myY < 550))
		body = opt4;
	    else if ((myX >= 405) && (myX < 505) && (myY > 450) && (myY < 550))
		body = opt5;
	    else if ((myX >= 505) && (myX < 605) && (myY > 450) && (myY < 550))
		body = opt6;
	    else if ((myX >= 605) && (myX < 705) && (myY > 450) && (myY < 550))
		body = opt7;
	    else if ((myX >= 705) && (myX < 805) && (myY > 450) && (myY < 550))
		body = opt8;

	    if ((myX >= 0) && (myX < 105) && (myY > 250) && (myY < 350))
		visor = opt1;
	    else if ((myX >= 105) && (myX < 205) && (myY > 250) && (myY < 350))
		visor = opt2;
	    else if ((myX >= 205) && (myX < 305) && (myY > 250) && (myY < 350))
		visor = opt3;
	    else if ((myX >= 305) && (myX < 405) && (myY > 250) && (myY < 350))
		visor = opt4;
	    else if ((myX >= 405) && (myX < 505) && (myY > 250) && (myY < 350))
		visor = opt5;
	    else if ((myX >= 505) && (myX < 605) && (myY > 250) && (myY < 350))
		visor = opt6;
	    else if ((myX >= 605) && (myX < 705) && (myY > 250) && (myY < 350))
		visor = opt7;
	    else if ((myX >= 705) && (myX < 805) && (myY > 250) && (myY < 350))
		visor = opt8;

	    drawplayer (g);

	    if ((myX >= 340) && (myX <= 470) && (myY >= 50) && (myY <= 150))
	    {
		delay (10);
		charselect = 1;
		instructions = 0;
	    }

	}

	if (instructions == 0)
	{
	    myX = 65;
	    myY = 65;
	    g.setFont (stuff);
	    g.setColor (Color.lightGray);
	    g.fillRect (0, 0, 5000, 5000);
	    // g.setColor(Color.black);
	    // g.fillRect(50,50,30,30);
	    drawplayer (g);
	    g.setColor (Color.blue);
	    g.fillOval (50, 100, 30, 30);
	    int xpoints[] = {65, 55, 75};
	    int ypoints[] = {84, 104, 104};
	    int npoints = 3;
	    g.fillPolygon (xpoints, ypoints, npoints);
	    printfrog (g, 50, 150, froggo1, froggo2);
	    r1 = (int) (Math.random () * 255);
	    g1 = (int) (Math.random () * 255);
	    b1 = (int) (Math.random () * 255);
	    r2 = 255 - r1;
	    g2 = 255 - g1;
	    b2 = 255 - b1;
	    froggo1 = new Color (r1, g1, b1);
	    froggo2 = new Color (r2, g2, b2);
	    printfrog (g, 90, 150, froggo1, froggo2);
	    r1 = (int) (Math.random () * 255);
	    g1 = (int) (Math.random () * 255);
	    b1 = (int) (Math.random () * 255);
	    r2 = 255 - r1;
	    g2 = 255 - g1;
	    b2 = 255 - b1;
	    froggo1 = new Color (r1, g1, b1);
	    froggo2 = new Color (r2, g2, b2);
	    printfrog (g, 130, 150, froggo1, froggo2);
	    //g.setColor(Color.black);
	    //g.fillRect(50,200,70,70); //enemy 1
	    drawenemy1 (g);
	    //g.setColor(Color.gray);
	    //g.fillRect(50,280,50,50); //enemy 2
	    drawenemy2 (g);
	    //g.setColor(Color.darkGray);
	    //g.fillRect(120,280,30,30);//enemy 3
	    drawenemy3 (g);
	    g.setColor (Color.black);
	    g.drawString ("<---This is you", 150, 65);
	    g.drawString ("<---Pick these up", 150, 115);
	    g.drawString ("<---Pick these up", 180, 165);
	    g.drawString ("<---AVOID THESE", 200, 280);
	    g.drawString ("Use the arrow keys to move", 300, 400);

	    delay (50);
	    g.setColor (Color.lightGray);
	    g.fillRect (0, 0, 5000, 5000);
	    instructions = 1;
	    level = 1;
	}

	if (losegame == 1)
	{
	    if (losestage == 0)
	    {
		g.setFont (stuff);
		g.setColor (Color.black);
		g.fillRect (0, 0, 5000, 5000);
		delay (10);
		g.setColor (Color.red);
		g.drawString ("oops u dieded", 50, 50);
		delay (10);
		g.setColor (Color.black);
		g.fillRect (0, 0, 5000, 5000);
		g.setColor (Color.red);
		g.drawString ("oops u dieded", 50, 50);
		g.setColor (Color.green);
		g.fillRect (10, 500, 100, 100);
		g.setColor (Color.red);
		g.fillRect (700, 500, 100, 100);
		delay (20);
		myX = 400;
		myY = 600;
		// g.setColor(Color.magenta);
		// g.fillRect (myX-15, myY-15, 30,30);
		drawplayer (g);
		losestage = 1;
	    }
	    g.setFont (stuff);
	    g.setColor (Color.black);
	    g.fillRect (0, 0, 5000, 5000);
	    g.setColor (Color.red);
	    g.drawString ("oops u dieded", 50, 50);
	    g.setColor (Color.green);
	    g.fillRect (10, 500, 100, 100);
	    g.setColor (Color.red);
	    g.fillRect (700, 500, 100, 100);
	    g.setColor (Color.black);
	    g.drawString ("Try", 28, 530);
	    g.drawString ("Again", 15, 570);
	    g.drawString ("QUIT", 710, 560);
	    // g.setColor(Color.magenta);
	    // g.fillRect (myX-15, myY-15, 30,30);
	    drawplayer (g);
	    if ((myX > 10) && (myX < 110) && (myY > 500) && (myY < 600))
	    {
		stage1 = 1;
		stage2 = 1;
		stage3 = 1;
		losegame = 0;
		losestage = 1;
	    }
	    else if ((myX > 710) && (myX < 800) && (myY > 500) && (myY < 600))
	    {
		g.setColor (Color.black);
		g.fillRect (0, 0, 5000, 5000);
		System.exit (0);
	    }
	}

	else if (wingame == 1)
	    {
	    for(int w=0;w<=1800;w=w+4)
		{
		g.setColor (Color.black);
		g.fillRect (0, 0, 1000, 1000);
		
		g.setColor(Color.white);
		if (w % 50 <= 25)
		    {
		    g.setColor (Color.white);
		    star2 (g, starx, stary);
		    }

		if (w % 50 >= 25)
		    {
		    g.setColor (Color.white);
		    star1 (g, starx, stary);
		    }

		g.setColor (Color.yellow);
		g.setFont(intro);
		if(w>=200)
		    {
		    g.drawString ("CONGRATULATIONS", 25, 25);
		    g.drawString ("You have finished the preparations for the Sir Isaac Newton ritual.", 25, 50);
		    }

		if(w>=400)
		    {
		    g.drawString ("What happens now?", 100, 150);
		    }
		
		if (w>=600)
		    {
		    g.drawString ("You'll have to wait until next time.", 200, 250);
		    }

		delay (0.5);
		}
	    }

	else if (level == 1)
	{
	    if (stage1 == 1)
	    {

		for (int d = 100 ; d > 1 ; d--)
		{
		    g.setColor (Color.black);
		    g.fillRect (0, 0, 1000, 1000);

		    g.setColor (Color.red);
		    g.setFont (intro);

		    g.drawString ("HOLD UP.", 140, 100);
		    g.drawString ("Remember,", 370, 225);
		    g.drawString ("you were a mission specialist - NOT A FIGHTER.", 180, 250);
		    g.drawString ("All you did was carry out engineering-specific missions,", 180, 275);

		    g.drawString ("so if you happen to encouter one of those blob-looking lifeforms,", 120, 320);
		    g.drawString ("run.", 350, 340);

		    delay (1);
		}

		myX = 400;
		myY = 600;
		hp = 200;
		water = 0;
		hit = 0;
		waterx = 600;
		watery = 500;
		waterz = 5;
		frog = 0;
		frog1x = 200;
		frog1y = 300;
		enemyx [0] = 200;
		enemyy [0] = 300;
		enemyx [1] = 500;
		enemyy [1] = 500;
		enemyx [2] = 300;
		enemyy [2] = 300;
		g.setColor (Color.lightGray);
		g.fillRect (0, 0, 5000, 5000);
		g.setColor (Color.gray);
		g.setFont (stage);
		g.drawString ("STAGE 1", 276, 376);
		g.setColor (Color.darkGray);
		g.drawString ("STAGE 1", 278, 378);
		g.setColor (Color.black);
		g.drawString ("STAGE 1", 280, 380);
		delay (20);
		g.setColor (Color.lightGray);
		g.fillRect (0, 0, 5000, 5000);
		stage1 = 0;
	    }
	    g.setFont (stuff);
	    g.setColor (Color.gray);
	    g.fillRect (0, 0, 900, 110); //info bar
	    // g.setColor(Color.black); ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    // g.fillRect(enemyx[0],enemyy[0],70,70); //enemy 1
	    drawenemy1 (g);
	    // g.setColor(Color.gray);
	    // g.fillRect(enemyx[1],enemyy[1],50,50); //enemy 2
	    drawenemy2 (g);
	    // g.setColor(Color.darkGray);
	    // g.fillRect(enemyxy[2],30,30); //enemy 3
	    drawenemy3 (g);
	    g.setColor (Color.blue);
	    if (waterz >= 5)
	    {
		g.fillOval (waterx, watery + 100, 30, 30); //water drop
		int xpoints[] = {waterx + 15, waterx + 5, waterx + 25};
		int ypoints[] = {watery + 84, watery + 104, watery + 104};
		int npoints = 3;
		g.fillPolygon (xpoints, ypoints, npoints);
	    }
	    else if (waterz <= 1)
	    {
		g.fillOval (waterx, watery + 450, 30, 30); //water drop
		int xpoints[] = {waterx + 15, waterx + 5, waterx + 25};
		int ypoints[] = {watery + 434, watery + 454, watery + 454};
		int npoints = 3;
		g.fillPolygon (xpoints, ypoints, npoints);
	    }

	    printfrog (g, frog1x, frog1y + 100, froggo1, froggo2);
	    g.setColor (Color.black);
	    g.fillRect (55, 60, 220, 40);
	    g.fillRect (295, 60, 220, 40);
	    g.fillRect (535, 60, 220, 40);
	    g.drawString ("HEALTH", 99, 49);
	    g.drawString ("WATER", 344, 49);
	    g.drawString ("SPECIES", 574, 49); //background bars
	    g.setColor (Color.red);
	    g.drawString ("HEALTH", 100, 50);
	    g.setColor (Color.blue);
	    g.drawString ("WATER", 345, 50);
	    g.setColor (Color.green);
	    g.drawString ("SPECIES", 575, 50);
	    g.setColor (Color.black);

	    if (myX < 15)
		myX = 15;
	    if (myX > 790)
		myX = 790;
	    if (myY < 125)
		myY = 125;
	    if (myY > 690)
		myY = 690;

	    frogmove ();
	    //
	    enemymove ();
	    //

	    hit = 0;
	    for (int r = 0 ; r <= 2 ; r++)
	    {
		if ((myX > enemyx [r] - 10) && (myX < enemyx [r] + enemysize [r] + 10) && (myY > enemyy [r] - 10) && (myY < enemyy [r] + enemysize [r] + 10)) //enemy hitbox
		{
		    g.setColor (Color.red);
		    g.fillRect (myX - 15, myY - 15, 30, 30);
		    hp = hp - 5;
		    hit = 1;
		}
	    }

	    if ((waterz >= 5) && ((myX > waterx - 10) && (myX < waterx + 40) && (myY > watery + 90) && (myY < watery + 140))) //water hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		water = water + 20;
		if (water >= 200)
		    water = 200;
		waterx = (int) (Math.random () * 750);
		watery = (int) (Math.random () * 230);
		waterz = 1;
		hit = 1;
	    }
	    else if ((waterz <= 1) && ((myX > waterx - 10) && (myX < waterx + 40) && (myY > watery + 440) && (myY < watery + 490))) //water hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		water = water + 20;
		if (water >= 200)
		    water = 200;
		waterx = (int) (Math.random () * 750);
		watery = (int) (Math.random () * 240);
		waterz = 5;
		hit = 1;
	    }

	    else if ((myX > frog1x - 10) && (myX < frog1x + 40) && (myY > frog1y + 90) && (myY < frog1y + 140)) //frog hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		frog = frog + 40;
		if (frog >= 200)
		    frog = 200;
		frog1x = (int) (Math.random () * 750);
		frog1y = (int) (Math.random () * 550);
		r1 = (int) (Math.random () * 255);
		g1 = (int) (Math.random () * 255);
		b1 = (int) (Math.random () * 255);
		r2 = 255 - r1;
		g2 = 255 - g1;
		b2 = 255 - b1;
		froggo1 = new Color (r1, g1, b1);
		froggo2 = new Color (r2, g2, b2);
		hit = 1;
	    }

	    if (hit == 0) //nothing hit
	    {
		// g.setColor(Color.magenta);
		// g.fillRect (myX-15, myY-15, 30,30);
		drawplayer (g);
	    }

	    g.setColor (Color.red);
	    g.fillRect (65, 65, hp, 30); //hp bar
	    g.setColor (Color.blue);
	    g.fillRect (305, 65, water, 30); //water bar
	    g.setColor (Color.green);
	    g.fillRect (545, 65, frog, 30); //frog bar

	    if ((water >= 200) && (frog >= 200))
	    {
		g.setFont (stage);
		g.setColor (Color.red);
		g.drawString ("GOOD JOB", 226, 376);
		g.setColor (Color.blue);
		g.drawString ("GOOD JOB", 224, 374);
		g.setColor (Color.green);
		g.drawString ("GOOD JOB", 222, 372);
		delay (20);
		level = 2;
	    }
	    else if (hp <= 0)
	    {
		g.setColor (Color.black);
		g.fillRect (55, 60, 220, 40);
		delay (20);
		losegame = 1;
		losestage = 0;
	    }
	}

	else if (level == 2)
	{
	    if (stage2 == 1)
	    {
		for (int d = 100 ; d > 1 ; d--)
		{
		    g.setColor (Color.black);
		    g.fillRect (0, 0, 1000, 1000);

		    g.setColor (Color.white);
		    g.drawString ("Those monster-things sure are peculiar.", 200, 250);
		    g.drawString ("If they weren't so dangerous, you could probably go and", 200, 280);
		    g.drawString ("collect samples from them and analyze what kind of", 200, 310);
		    g.drawString ("elements exist within them...", 200, 340);
		    
		    g.drawString ("There may even be undiscovered", 200, 380);
		    g.drawString ("elements on this planet.", 200, 410);
  
		    g.drawString ("Actually, let's not risk getting attacked by those monsters.", 200, 470);
		    g.drawString ("Our priority is to carry out the ritual of Newton.", 200, 500);

		    delay (1.2);
		}


		myX = 650;
		myY = 175;
		hp = 200;
		water = 0;
		hit = 0;
		waterx = 600;
		watery = 550;
		waterz = 5;
		frog = 0;
		frog1x = 300;
		frog1y = 175;
		enemyx [0] = 200;
		enemyy [0] = 650;
		enemyx [1] = 500;
		enemyy [1] = 500;
		enemyx [2] = 125;
		enemyy [2] = 200;
		g.setColor (Color.lightGray);
		g.fillRect (0, 0, 1000, 1000);
		g.setColor (Color.gray);
		g.setFont (stage);
		g.drawString ("STAGE 2", 276, 376);
		g.setColor (Color.darkGray);
		g.drawString ("STAGE 2", 278, 378);
		g.setColor (Color.black);
		g.drawString ("STAGE 2", 280, 380);
		delay (20);
		g.setColor (Color.lightGray);
		g.fillRect (0, 0, 5000, 5000);
		stage2 = 0;
	    }
	    g.setFont (stuff);
	    g.setColor (Color.gray);
	    g.fillRect (0, 0, 900, 110); //info bar
	    g.setColor (Color.blue);
	    g.fillRect (0, 350, 900, 100); //river
	    g.setColor (Color.lightGray);
	    g.fillRect (200, 350, 70, 100); //bridge 1
	    g.fillRect (650, 350, 70, 100); //bridge 2
	    g.setColor (Color.darkGray);
	    g.fillRect (195, 345, 5, 110); //rail 1.1
	    g.fillRect (270, 345, 5, 110); //rail 1.2
	    g.fillRect (645, 345, 5, 110); //rail 2.1
	    g.fillRect (720, 345, 5, 110); //rail 2.2
	    // g.setColor(Color.black);
	    // g.fillRect(enemyx[0],enemyy[0],70,70); //enemy 1
	    drawenemy1 (g);
	    // g.setColor(Color.gray);
	    // g.fillRect(enemyx[1],enemyy[1],50,50); //enemy 2
	    drawenemy2 (g);
	    // g.setColor(Color.darkGray);
	    // g.fillRect(enemyx[2],enemyy[2],30,30); //enemy 3
	    drawenemy3 (g);
	    g.setColor (Color.blue);
	    if (waterz >= 5)
	    {
		g.fillOval (waterx, watery + 100, 30, 30); //water drop
		int xpoints[] = {waterx + 15, waterx + 5, waterx + 25};
		int ypoints[] = {watery + 84, watery + 104, watery + 104};
		int npoints = 3;
		g.fillPolygon (xpoints, ypoints, npoints);
	    }
	    else if (waterz <= 1)
	    {
		g.fillOval (waterx, watery + 450, 30, 30); //water drop
		int xpoints[] = {waterx + 15, waterx + 5, waterx + 25};
		int ypoints[] = {watery + 434, watery + 454, watery + 454};
		int npoints = 3;
		g.fillPolygon (xpoints, ypoints, npoints);
	    }

	    printfrog (g, frog1x, frog1y + 100, froggo1, froggo2);
	    g.setColor (Color.black);
	    g.fillRect (55, 60, 220, 40);
	    g.fillRect (295, 60, 220, 40);
	    g.fillRect (535, 60, 220, 40);
	    g.drawString ("HEALTH", 99, 49);
	    g.drawString ("WATER", 344, 49);
	    g.drawString ("SPECIES", 574, 49); //background bars
	    g.setColor (Color.red);
	    g.fillRect (65, 65, hp, 30); //hp bar
	    g.drawString ("HEALTH", 100, 50);
	    g.setColor (Color.blue);
	    g.fillRect (305, 65, water, 30); //water bar
	    g.drawString ("WATER", 345, 50);
	    g.setColor (Color.green);
	    g.fillRect (545, 65, frog, 30); //frog bar
	    g.drawString ("SPECIES", 575, 50);
	    g.setColor (Color.black);

	    if (myX < 15)
		myX = 15;
	    if (myX > 790)
		myX = 790;
	    if (myY < 125)
		myY = 125;
	    if (myY > 690)
		myY = 690;

	    if ((myY <= 400) && ((((myX > 0) && (myX < 200)) || ((myX > 270) && (myX < 650)) || ((myX > 720) && (myX < 800))) && (myY > 340))) //river player
		myY = 345;
	    if ((myY >= 400) && ((((myX > 0) && (myX < 200)) || ((myX > 270) && (myX < 650)) || ((myX > 720) && (myX < 800))) && (myY < 460)))
		myY = 455;
	    if ((myY >= 350) && (myY <= 450)) //river player
	    {
		if ((myX >= 200) && (myX <= 270))
		{
		    if (myX <= 205)
			myX = 210;
		    else if (myX >= 265)
			myX = 260;
		}
		if ((myX >= 650) && (myX <= 720))
		{
		    if (myX <= 655)
			myX = 660;
		    else if (myX >= 715)
			myX = 710;
		}
	    }


	    frogmove ();

	    enemymove ();

	    for (int r = 1 ; r <= 2 ; r++)
	    {
		if (enemyy [r] <= 400) //river enemy
		{
		    if ((((enemyx [r] > 0) && (enemyx [r] + (enemysize [r] / 2) < 200)) || ((enemyx [r] + (enemysize [r] / 2) > 270) && (enemyx [r] + (enemysize [r] / 2) < 650)) || ((enemyx [r] + (enemysize [r] / 2) > 720) && (enemyx [r] < 800))) && (enemyy [r] + (enemysize [r] / 2) > 350))
			enemyy [r] = 350 - (enemysize [r] / 2);
		}
		if (enemyy [r] >= 400) //river enemy
		{
		    if ((((enemyx [r] > 0) && (enemyx [r] + (enemysize [r] / 2) < 200)) || ((enemyx [r] + (enemysize [r] / 2) > 270) && (enemyx [r] + (enemysize [r] / 2) < 650)) || ((enemyx [r] + (enemysize [r] / 2) > 720) && (enemyx [r] < 800))) && (enemyy [r] + (enemysize [r] / 2) < 440))
			enemyy [r] = 450 - (enemysize [r] / 2);
		}
		if ((enemyy [r] + (enemysize [r] / 2) >= 350) && (enemyy [r] + (enemysize [r] / 2) <= 450)) //river enemy2
		{
		    if ((enemyx [r] + (enemysize [r] / 2) >= 200) && (enemyx [r] + (enemysize [r] / 2) <= 270))
		    {
			if (enemyx [r] + (enemysize [r] / 2) <= 200 + 5)
			    enemyx [r] = 200 - (enemysize [r] / 2) + 10;
			else if (enemyx [r] + (enemysize [r] / 2) >= 270 - 5)
			    enemyx [r] = 270 - (enemysize [r] / 2) - 10;
		    }
		    if ((enemyx [r] + (enemysize [r] / 2) >= 650) && (enemyx [r] + (enemysize [r] / 2) <= 720))
		    {
			if (enemyx [r] + (enemysize [r] / 2) <= 650 + 5)
			    enemyx [r] = 650 - (enemysize [r] / 2) + 10;
			else if (enemyx [r] + (enemysize [r] / 2) >= 720 - 5)
			    enemyx [r] = 720 - (enemysize [r] / 2) - 10;
		    }
		}
	    }


	    hit = 0;
	    for (int r = 0 ; r <= 2 ; r++)
	    {
		if ((myX > enemyx [r] - 10) && (myX < enemyx [r] + enemysize [r] + 10) && (myY > enemyy [r] - 10) && (myY < enemyy [r] + enemysize [r] + 10)) //enemy hitbox
		{
		    g.setColor (Color.red);
		    g.fillRect (myX - 15, myY - 15, 30, 30);
		    hp = hp - 5;
		    hit = 1;
		}
	    }

	    if ((waterz >= 5) && ((myX > waterx - 10) && (myX < waterx + 40) && (myY > watery + 90) && (myY < watery + 140))) //water hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		water = water + 20;
		if (water >= 200)
		    water = 200;
		waterx = (int) (Math.random () * 750);
		watery = (int) (Math.random () * 230);
		waterz = 1;
		hit = 1;
	    }
	    else if ((waterz <= 1) && ((myX > waterx - 10) && (myX < waterx + 40) && (myY > watery + 440) && (myY < watery + 490))) //water hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		water = water + 20;
		if (water >= 200)
		    water = 200;
		waterx = (int) (Math.random () * 750);
		watery = (int) (Math.random () * 240);
		waterz = 5;
		hit = 1;
	    }

	    else if ((myX > frog1x - 10) && (myX < frog1x + 40) && (myY > frog1y + 90) && (myY < frog1y + 140)) //frog hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		frog = frog + 40;
		if (frog >= 200)
		    frog = 200;
		frog1x = (int) (Math.random () * 750);
		frog1y = (int) (Math.random () * 550);
		r1 = (int) (Math.random () * 255);
		g1 = (int) (Math.random () * 255);
		b1 = (int) (Math.random () * 255);
		r2 = 255 - r1;
		g2 = 255 - g1;
		b2 = 255 - b1;
		froggo1 = new Color (r1, g1, b1);
		froggo2 = new Color (r2, g2, b2);

		hit = 1;
	    }

	    if (hit == 0) //nothing hit
	    {
		// g.setColor(Color.magenta);
		// g.fillRect (myX-15, myY-15, 30,30);
		drawplayer (g);
	    }

	    g.setColor (Color.red);
	    g.fillRect (65, 65, hp, 30); //hp bar
	    g.setColor (Color.blue);
	    g.fillRect (305, 65, water, 30); //water bar
	    g.setColor (Color.green);
	    g.fillRect (545, 65, frog, 30); //frog bar

	    if ((water >= 200) && (frog >= 200))
	    {
		g.setFont (stage);
		g.setColor (Color.red);
		g.drawString ("GOOD JOB", 226, 376);
		g.setColor (Color.blue);
		g.drawString ("GOOD JOB", 224, 374);
		g.setColor (Color.green);
		g.drawString ("GOOD JOB", 222, 372);
		delay (20);
		level = 3;
	    }
	    else if (hp <= 0)
	    {
		g.setColor (Color.black);
		g.fillRect (55, 60, 220, 40);
		delay (20);
		losegame = 1;
		losestage = 0;
	    }

	}

	else if (level == 3) //level3
	{
	    if (stage3 == 1)
	    {
		for (int d = 100 ; d > 1 ; d--)
		{
		    g.setColor (Color.black);
		    g.fillRect (0, 0, 1000, 1000);

		    g.setColor (Color.white);
		    g.drawString ("After the ritual itself, you could focus on learning", 200, 250);
		    g.drawString ("more about those blobs, then maybe look into", 200, 280);
		    g.drawString ("what kind of environment they need to live in to survive.", 200, 310);

		    g.drawString ("Well, let's not get too ahead of ourselves.", 200, 370);
		    g.drawString ("You're almost done - just one more level of collecting!", 200, 400);

		    g.drawString ("Be careful, there seems to be a lot of thunder;", 200, 460);
		    g.drawString ("I think the Physics gods are angry that you're taking so long...", 200, 490);

		    delay (1.2);
		}

		myX = 650;
		myY = 175;
		hp = 200;
		water = 0;
		hit = 0;
		waterx = 600;
		watery = 550;
		waterz = 5;
		frog = 0;
		frog1x = 300;
		frog1y = 175;
		enemyx [0] = 200;
		enemyy [0] = 650;
		enemyx [1] = 500;
		enemyy [1] = 500;
		enemyx [2] = 125;
		enemyy [2] = 200;
		g.setColor (Color.lightGray);
		g.fillRect (0, 0, 1000, 1000);
		g.setColor (Color.gray);
		g.setFont (stage);
		g.drawString ("STAGE 3", 276, 376);
		g.setColor (Color.darkGray);
		g.drawString ("STAGE 3", 278, 378);
		g.setColor (Color.black);
		g.drawString ("STAGE 3", 280, 380);
		delay (20);
		g.setColor (Color.lightGray);
		g.fillRect (0, 0, 5000, 5000);
		stage3 = 0;
	    }
	    g.setFont (stuff);
	    g.setColor (Color.gray);
	    g.fillRect (0, 0, 900, 110); //info bar
	    // g.setColor(Color.black);
	    // g.fillRect(enemyx[0],enemyy[0],70,70); //enemy 1
	    drawenemy1 (g);
	    // g.setColor(Color.gray);
	    // g.fillRect(enemyx[1],enemyy[1],50,50); //enemy 2
	    drawenemy2 (g);
	    // g.setColor(Color.darkGray);
	    // g.fillRect(enemyx[2],enemyy[2],30,30); //enemy 3
	    drawenemy3 (g);
	    g.setColor (Color.blue);
	    // if (waterz>=5)
	    //     {
	    g.fillOval (waterx, watery + 100, 30, 30); //water drop
	    int xpoints[] = {waterx + 15, waterx + 5, waterx + 25};
	    int ypoints[] = {watery + 84, watery + 104, watery + 104};
	    int npoints = 3;
	    g.fillPolygon (xpoints, ypoints, npoints);
	    //     }
	    // else if (waterz<=1)
	    //     {
	    //     g.fillOval(waterx,watery+450,30,30); //water drop
	    //     int xpoints[] = {waterx+15,waterx+5,waterx+25};
	    //     int ypoints[] = {watery+434,watery+454,watery+454};
	    //     int npoints = 3;
	    //     g.fillPolygon(xpoints, ypoints, npoints);
	    //     }

	    printfrog (g, frog1x, frog1y + 100, froggo1, froggo2);
	    g.setColor (Color.black);
	    g.fillRect (55, 60, 220, 40);
	    g.fillRect (295, 60, 220, 40);
	    g.fillRect (535, 60, 220, 40);
	    g.drawString ("HEALTH", 99, 49);
	    g.drawString ("WATER", 344, 49);
	    g.drawString ("SPECIES", 574, 49); //background bars
	    g.setColor (Color.red);
	    g.fillRect (65, 65, hp, 30); //hp bar
	    g.drawString ("HEALTH", 100, 50);
	    g.setColor (Color.blue);
	    g.fillRect (305, 65, water, 30); //water bar
	    g.drawString ("WATER", 345, 50);
	    g.setColor (Color.green);
	    g.fillRect (545, 65, frog, 30); //frog bar
	    g.drawString ("SPECIES", 575, 50);
	    g.setColor (Color.black);

	    if (myX < 15)
		myX = 15;
	    if (myX > 790)
		myX = 790;
	    if (myY < 125)
		myY = 125;
	    if (myY > 690)
		myY = 690;

	    frogmove ();

	    enemymove ();

	    for (int r = 0 ; r <= 3 ; r++)
	    {
		if ((myX <= rockx [r] + 75) && (myY >= rocky [r] + 20) && (myY <= rocky [r] + 90) && (myX > rockx [r] - 15)) //player rock
		    myX = rockx [r] - 15;
		else if ((myX >= rockx [r] + 75) && (myY >= rocky [r] + 20) && (myY <= rocky [r] + 90) && (myX < rockx [r] + 165))
		    myX = rockx [r] + 165;
		else if ((myY <= rocky [r] + 45) && (myX >= rockx [r]) && (myX <= rockx [r] + 150) && (myY > rocky [r] + 5))
		    myY = rocky [r] + 5;
		else if ((myY >= rocky [r] + 45) && (myX >= rockx [r]) && (myX <= rockx [r] + 150) && (myY < rocky [r] + 105))
		    myY = rocky [r] + 105;
	    }

	    for (int r = 0 ; r <= 3 ; r++)
	    {
		if ((myX <= treex [r] + 10) && (myY >= treey [r]) && (myY <= treey [r] + 20) && (myX > treex [r] - 15)) //player tree
		    myX = treex [r] - 15;
		else if ((myX >= treex [r] + 10) && (myY >= treey [r]) && (myY <= treey [r] + 20) && (myX < treex [r] + 35))
		    myX = treex [r] + 35;
		else if ((myY <= treey [r] + 15) && (myX >= treex [r] - 5) && (myX <= treex [r] + 25) && (myY > treey [r] - 10))
		    myY = treey [r] - 15;
		else if ((myY >= treey [r] + 15) && (myX >= treex [r] - 5) && (myX <= treex [r] + 25) && (myY < treey [r] + 30))
		    myY = treey [r] + 35;
	    }

	    for (int q = 0 ; q <= 3 ; q++) //enemy rock
	    {
		for (int r = 0 ; r <= 2 ; r++)
		{
		    if ((enemyx [r] + (enemysize [r] / 2) <= rockx [q] + 75) && (enemyy [r] + enemysize [r] >= rocky [q] + 25) && (enemyy [r] <= rocky [q] + 85) && (enemyx [r] + enemysize [r] > rockx [q]))
			enemyx [r] = (rockx [q] - enemysize [r]);
		    else if ((enemyx [r] + (enemysize [r] / 2) >= rockx [q] + 75) && (enemyy [r] >= rocky [q] - enemysize [r] + 25) && (enemyy [r] <= rocky [q] + 85) && (enemyx [r] < rockx [q] + 150))
			enemyx [r] = (rockx [q] + 150);
		    else if ((enemyy [r] + (enemysize [r] / 2) <= rocky [q] + 45) && (enemyx [r] >= rockx [q] - enemysize [r] + 5) && (enemyx [r] <= rockx [q] + 145) && (enemyy [r] + enemysize [r] > rocky [q] + 20))
			enemyy [r] = (rocky [q] - enemysize [r] + 20);
		    else if ((enemyy [r] + (enemysize [r] / 2) >= rocky [q] + 45) && (enemyx [r] >= rockx [q] - enemysize [r] + 5) && (enemyx [r] <= rockx [q] + 145) && (enemyy [r] < rocky [q] + 90))
			enemyy [r] = (rocky [q] + 90);
		}
	    }

	    hit = 0;
	    for (int r = 0 ; r <= 2 ; r++)
	    {
		if ((myX > enemyx [r] - 10) && (myX < enemyx [r] + enemysize [r] + 10) && (myY > enemyy [r] - 10) && (myY < enemyy [r] + enemysize [r] + 10)) //enemy hitbox
		{
		    g.setColor (Color.red);
		    g.fillRect (myX - 15, myY - 15, 30, 30);
		    hp = hp - 5;
		    hit = 1;
		}
	    }

	    if ((waterz == 1) && ((myX > waterx - 10) && (myX < waterx + 40) && (myY > watery + 90) && (myY < watery + 140))) //water hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		water = water + 20;
		if (water >= 200)
		    water = 200;
		waterx = ((int) (Math.random () * 400) + 350);
		watery = ((int) (Math.random () * 200) + 200);
		waterz = 5;
		hit = 1;
	    }
	    else if ((waterz == 5) && ((myX > waterx - 10) && (myX < waterx + 40) && (myY > watery + 90) && (myY < watery + 140))) //water hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		water = water + 20;
		if (water >= 200)
		    water = 200;
		waterx = ((int) (Math.random () * 300) + 250);
		watery = ((int) (Math.random () * 200) + 450);
		waterz = 7;
		hit = 1;
	    }
	    else if ((waterz == 7) && ((myX > waterx - 10) && (myX < waterx + 40) && (myY > watery + 90) && (myY < watery + 140))) //water hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		water = water + 20;
		if (water >= 200)
		    water = 200;
		waterx = ((int) (Math.random () * 400) + 20);
		watery = ((int) (Math.random () * 200) + 20);
		waterz = 1;
		hit = 1;
	    }

	    else if ((myX > frog1x - 10) && (myX < frog1x + 40) && (myY > frog1y + 90) && (myY < frog1y + 140)) //frog hitbox
	    {
		g.setColor (Color.green);
		g.fillRect (myX - 15, myY - 15, 30, 30);
		frog = frog + 40;
		if (frog >= 200)
		    frog = 200;
		frog1x = (int) (Math.random () * 750);
		frog1y = (int) (Math.random () * 550);
		r1 = (int) (Math.random () * 255);
		g1 = (int) (Math.random () * 255);
		b1 = (int) (Math.random () * 255);
		r2 = 255 - r1;
		g2 = 255 - g1;
		b2 = 255 - b1;
		froggo1 = new Color (r1, g1, b1);
		froggo2 = new Color (r2, g2, b2);

		hit = 1;
	    }

	    if (hit == 0) //nothing hit
	    {
		// g.setColor(Color.magenta);
		// g.fillRect (myX-15, myY-15, 30,30);
		drawplayer (g);
	    }

	    // g.setColor (Color.black);
	    // g.fillRect (105, 565, 150, 90); //rock1
	    rock1 (g);
	    //g.fillRect (565, 515, 150, 90); //rock2
	    rock2 (g);
	    //g.fillRect (155, 365, 150, 90); //rock3
	    rock3 (g);
	    //g.fillRect (455, 215, 150, 90); //rock4
	    rock4 (g);
	    g.setColor (Color.orange);
	    g.fillRect (355, 295, 20, 200); //trunk1
	    g.fillRect (705, 195, 20, 200); //trunk2
	    g.fillRect (95, 145, 20, 200); //trunk3
	    g.fillRect (505, 445, 20, 200); //trunk4
	    
	    g.setColor (bushy); // leafy part

	    int tree1x = 290; // tree1
	    int tree1y = 260;
	    
	    g.fillRect (tree1x + 1, tree1y + 32, 168, 8);
	    g.fillRect (tree1x + 1, tree1y + 40, 80, 8);
	    g.fillRect (tree1x + 1, tree1y + 48, 32, 16);
	    g.fillRect (tree1x + 8, tree1y + 64, 21 * 8, 8);
	    g.fillRect (tree1x + 8, tree1y + 72, 19 * 8, 8);
	    g.fillRect (tree1x + 16, tree1y + 8, 64, 8);
	    g.fillRect (tree1x + 16, tree1y + 16, 32, 8);
	    g.fillRect (tree1x + 16, tree1y + 24, 24, 8);
	    g.fillRect (tree1x + 48, tree1y + 56, 56, 8);
	    g.fillRect (tree1x + 56, tree1y + 48, 48, 8);
	    g.fillRect (tree1x + 64, tree1y + 16, 64, 8);
	    g.fillRect (tree1x + 64, tree1y + 80, 72, 8);
	    g.fillRect (tree1x + 72, tree1y + 24, 88, 8);
	    g.fillRect (tree1x + 96, tree1y + 40, 16, 8);
	    g.fillRect (tree1x + 112, tree1y + 56, 72, 8);
	    g.fillRect (tree1x + 120, tree1y + 40, 56, 8);
	    g.fillRect (tree1x + 120, tree1y + 48, 16, 8);
	    g.fillRect (tree1x + 18 * 8, tree1y + 48, 40, 8);
	   
	    int tree2x = 640; // tree2
	    int tree2y = 160;
	    
	    g.fillRect (tree2x + 1, tree2y + 32, 168, 8);
	    g.fillRect (tree2x + 1, tree2y + 40, 80, 8);
	    g.fillRect (tree2x + 1, tree2y + 48, 32, 16);
	    g.fillRect (tree2x + 8, tree2y + 64, 21 * 8, 8);
	    g.fillRect (tree2x + 8, tree2y + 72, 19 * 8, 8);
	    g.fillRect (tree2x + 16, tree2y + 8, 64, 8);
	    g.fillRect (tree2x + 16, tree2y + 16, 32, 8);
	    g.fillRect (tree2x + 16, tree2y + 24, 24, 8);
	    g.fillRect (tree2x + 48, tree2y + 56, 56, 8);
	    g.fillRect (tree2x + 56, tree2y + 48, 48, 8);
	    g.fillRect (tree2x + 64, tree2y + 16, 64, 8);
	    g.fillRect (tree2x + 64, tree2y + 80, 72, 8);
	    g.fillRect (tree2x + 72, tree2y + 24, 88, 8);
	    g.fillRect (tree2x + 96, tree2y + 40, 16, 8);
	    g.fillRect (tree2x + 112, tree2y + 56, 72, 8);
	    g.fillRect (tree2x + 120, tree2y + 40, 56, 8);
	    g.fillRect (tree2x + 120, tree2y + 48, 16, 8);
	    g.fillRect (tree2x + 18 * 8, tree2y + 48, 40, 8);
	    
	    int tree3x = 30; // tree3
	    int tree3y = 110;
	    
	    g.fillRect (tree3x + 1, tree3y + 32, 168, 8);
	    g.fillRect (tree3x + 1, tree3y + 40, 80, 8);
	    g.fillRect (tree3x + 1, tree3y + 48, 32, 16);
	    g.fillRect (tree3x + 8, tree3y + 64, 21 * 8, 8);
	    g.fillRect (tree3x + 8, tree3y + 72, 19 * 8, 8);
	    g.fillRect (tree3x + 16, tree3y + 8, 64, 8);
	    g.fillRect (tree3x + 16, tree3y + 16, 32, 8);
	    g.fillRect (tree3x + 16, tree3y + 24, 24, 8);
	    g.fillRect (tree3x + 48, tree3y + 56, 56, 8);
	    g.fillRect (tree3x + 56, tree3y + 48, 48, 8);
	    g.fillRect (tree3x + 64, tree3y + 16, 64, 8);
	    g.fillRect (tree3x + 64, tree3y + 80, 72, 8);
	    g.fillRect (tree3x + 72, tree3y + 24, 88, 8);
	    g.fillRect (tree3x + 96, tree3y + 40, 16, 8);
	    g.fillRect (tree3x + 112, tree3y + 56, 72, 8);
	    g.fillRect (tree3x + 120, tree3y + 40, 56, 8);
	    g.fillRect (tree3x + 120, tree3y + 48, 16, 8);
	    g.fillRect (tree3x + 18 * 8, tree3y + 48, 40, 8);
	    
	    int tree4x = 440; // tree4
	    int tree4y = 410;
	    
	    g.fillRect (tree4x + 1, tree4y + 32, 168, 8);
	    g.fillRect (tree4x + 1, tree4y + 40, 80, 8);
	    g.fillRect (tree4x + 1, tree4y + 48, 32, 16);
	    g.fillRect (tree4x + 8, tree4y + 64, 21 * 8, 8);
	    g.fillRect (tree4x + 8, tree4y + 72, 19 * 8, 8);
	    g.fillRect (tree4x + 16, tree4y + 8, 64, 8);
	    g.fillRect (tree4x + 16, tree4y + 16, 32, 8);
	    g.fillRect (tree4x + 16, tree4y + 24, 24, 8);
	    g.fillRect (tree4x + 48, tree4y + 56, 56, 8);
	    g.fillRect (tree4x + 56, tree4y + 48, 48, 8);
	    g.fillRect (tree4x + 64, tree4y + 16, 64, 8);
	    g.fillRect (tree4x + 64, tree4y + 80, 72, 8);
	    g.fillRect (tree4x + 72, tree4y + 24, 88, 8);
	    g.fillRect (tree4x + 96, tree4y + 40, 16, 8);
	    g.fillRect (tree4x + 112, tree4y + 56, 72, 8);
	    g.fillRect (tree4x + 120, tree4y + 40, 56, 8);
	    g.fillRect (tree4x + 120, tree4y + 48, 16, 8);
	    g.fillRect (tree4x + 18 * 8, tree4y + 48, 40, 8);
	    
	    g.setColor (Color.blue);
	    g.fillRect (355, 475, 20, 20); //trunk1
	    g.fillRect (705, 375, 20, 20); //trunk2
	    g.fillRect (95, 325, 20, 20); //trunk3
	    g.fillRect (505, 625, 20, 20); //trunk4

	    g.setColor (Color.red);
	    g.fillRect (65, 65, hp, 30); //hp bar
	    g.setColor (Color.blue);
	    g.fillRect (305, 65, water, 30); //water bar
	    g.setColor (Color.green);
	    g.fillRect (545, 65, frog, 30); //frog bar

	    if ((water >= 200) && (frog >= 200))
	    {
		g.setFont (stage);
		// g.setColor(Color.blue);
		// g.fillRect(305,65,200,30); //water bar
		// g.setColor(Color.green);
		// g.fillRect(545,65,200,30); //frog bar
		g.setColor (Color.red);
		g.drawString ("GOOD JOB", 226, 376);
		g.setColor (Color.blue);
		g.drawString ("GOOD JOB", 224, 374);
		g.setColor (Color.green);
		g.drawString ("GOOD JOB", 222, 372);
		delay (20);
		wingame = 1;
	    }
	    else if (hp <= 0)
	    {
		g.setColor (Color.black);
		g.fillRect (55, 60, 220, 40);
		delay (20);
		losegame = 1;
		losestage = 0;
	    }


	}
    }





    public void moveIt (KeyEvent evt)
    {
	switch (evt.getKeyCode ())
	{
	    case KeyEvent.VK_DOWN:
		myY += 10;
		break;
	    case KeyEvent.VK_UP:
		myY -= 10;
		break;
	    case KeyEvent.VK_LEFT:
		myX -= 10;
		break;
	    case KeyEvent.VK_RIGHT:
		myX += 10;
		break;
	}
	repaint ();
    }


    public static void main (String[] args)
    {
	JFrame frame = new JFrame ("Gaem");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	ConqueringOfNewEarth ex = new ConqueringOfNewEarth ();

	frame.getContentPane ().add (ex);
	frame.pack ();
	frame.setResizable (false);
	frame.setVisible (true);
	ex.requestFocus ();
    }


    public static void delay (double seconds)
    {
	for (int s = 0 ; s <= seconds ; s++)
	{
	    for (int t = 1 ; t <= 100000000 ; t++)
	    {
	    }
	}
    }


    public void star1 (Graphics g, int[] starx, int[] stary)
    {
	for (int i = 0 ; i <= 24 ; i++)
	{
	    g.drawLine (starx [i] - 2, stary [i], starx [i] + 2, stary [i]);
	}
	for (int i = 0 ; i <= 24 ; i++)
	{
	    g.drawLine (starx [i], stary [i] - 2, starx [i], stary [i] + 2);
	}
    }


    public void star2 (Graphics g, int[] starx, int[] stary)
    {
	for (int i = 0 ; i <= 24 ; i++)
	{
	    g.drawLine (starx [i] - 2, stary [i] - 2, starx [i] + 2, stary [i] + 2);
	}
	for (int i = 0 ; i <= 24 ; i++)
	{
	    g.drawLine (starx [i] + 2, stary [i] - 2, starx [i] - 2, stary [i] + 2);
	}
    }


    public void opening (Graphics g, Font title, Font intro, int[] starx, int[] stary)
    {
	for (int flash = 1 ; flash < 5 ; flash++)
	{
	    g.setColor (Color.black);
	    g.fillRect (0, 0, 1000, 1000);
	    g.setColor (Color.red);
	    g.setFont (title);
	    g.drawString ("THE CONQUERING OF NEW EARTH", 100, 100);
	    g.setColor (Color.white);
	    star2 (g, starx, stary);
	    delay (5);
	    g.setColor (Color.black);
	    g.fillRect (0, 0, 1000, 1000);
	    g.setColor (Color.red);
	    g.setFont (title);
	    g.drawString ("THE CONQUERING OF NEW EARTH", 100, 100);
	    g.setColor (Color.white);
	    star1 (g, starx, stary);
	    delay (5);
	    g.setColor (Color.black);
	    g.fillRect (0, 0, 1000, 1000);
	    g.setColor (Color.red);
	}
    for (int a = 1600 ; a > 1 ; a = a - 4)
	{

	    if (a % 50 <= 25)
	    {
		g.setColor (Color.white);
		star2 (g, starx, stary);
	    }

	    if (a % 50 >= 25)
	    {
		g.setColor (Color.white);
		star1 (g, starx, stary);

	    }
	    g.setColor (Color.yellow);
	    g.setFont (intro);
	    g.drawString ("A few years ago, Dr. Richard Sun's team", 240, a-875);
	    g.drawString ("discovered a new habitable planet.", 263, a-850);
	    g.drawString ("The Global Government has decided", 242, a-825);
	    g.drawString ("to send a hand picked team", 275, a-800);
	    g.drawString ("to the planet to survey its surface.", 250, a-775);
	    
	    g.drawString ("You, a former astronaut, studied for too many years at Stanford", 130, a-700);
	    g.drawString ("for that PhD in Aeronautics and Astronautics", 222, a-675);
	    g.drawString ("and trained too long to pass the NASA space physical test,", 140, a-650);
	    g.drawString ("all to pursue your dream of being an astronaut.", 172, a-625);

	    g.drawString ("You gained detailed knowledge of mission requirements and objectives,", 85, a-575);
	    g.drawString ("as well as supporting systems and equipment for their assigned missions.", 65, a-550);
	    g.drawString ("As an astronaut, you performed numerous experiment operations;", 100, a-525);

	    g.drawString ("however, you decided that that life just wasn't for you.", 140, a-500);
	    
	    g.drawString ("So, you went back to Stanford and graduated once again -", 160, a-425);
	    g.drawString ("this time with a PhD in Developmental Science - and eventually", 135, a-400);
	    g.drawString ("became an astrobiologist.", 270, a-375);
	    
	    g.drawString ("Although you faced the critical scrutiny of your colleagues", 140, a-300);
	    g.drawString ("for such a rash decision,", 300, a-275);
	    g.drawString ("it is now your chance to shine.", 260, a-250);

	    g.drawString ("As an upcoming Nobel Laureate for physiology, you have discovered that", 65, a-200);
	    g.drawString ("an ancient ritual to call upon Sir Isaac Newton is the key to habitual life,", 64, a-175);
	    g.drawString ("and it requires collecting water and species from the planet in discussion.", 62, a-150);
	    g.drawString ("Because you previously were a mission specialist, the Global Government has", 40, a-125);
	    g.drawString ("personally asked you to join the team and undertake this mission on", 98, a-100);
	    g.drawString ("planet Earth-2.0:", 305, a-75);
	    delay (0.5);
	    g.setColor (Color.black);
	    g.fillRect (0, 0, 1000, 1000);
	}

    }


    public void printfrog (Graphics g, int frog1x, int frog1y, Color froggo1, Color froggo2)
    {
	g.setColor (froggo1);
	g.fillRect (frog1x + 8, frog1y + 2, 4, 24);
	g.fillRect (frog1x + 14, frog1y + 2, 4, 24);

	g.fillRect (frog1x - 2, frog1y + 14, 2, 10);
	g.fillRect (frog1x + 26, frog1y + 14, 2, 10);

	g.fillRect (frog1x, frog1y + 18, 2, 8);
	g.fillRect (frog1x + 24, frog1y + 18, 2, 8);

	g.fillRect (frog1x + 2, frog1y + 16, 2, 12);
	g.fillRect (frog1x + 22, frog1y + 16, 2, 12);

	g.fillRect (frog1x + 4, frog1y + 20, 6, 8);
	g.fillRect (frog1x + 16, frog1y + 20, 6, 8);

	g.fillRect (frog1x + 6, frog1y + 18, 14, 6);

	g.fillRect (frog1x + 10, frog1y, 6, 24);

	g.fillRect (frog1x + 6, frog1y + 8, 2, 6);
	g.fillRect (frog1x + 18, frog1y + 8, 2, 6);

	g.fillRect (frog1x + 4, frog1y, 2, 12);
	g.fillRect (frog1x + 20, frog1y, 2, 12);

	g.fillRect (frog1x + 2, frog1y + 2, 2, 8);
	g.fillRect (frog1x + 22, frog1y + 2, 2, 8);

	g.fillRect (frog1x, frog1y - 2, 2, 8);
	g.fillRect (frog1x + 24, frog1y - 2, 2, 8);

	g.setColor (Color.black);

	g.fillRect (frog1x + 8, frog1y + 2, 2, 4);
	g.fillRect (frog1x + 16, frog1y + 2, 2, 4);

	g.setColor (froggo2);

	g.fillRect (frog1x + 10, frog1y + 10, 1, 4);
	g.fillRect (frog1x + 8, frog1y + 16, 1, 3);
	g.fillRect (frog1x + 13, frog1y + 13, 1, 4);
	g.fillRect (frog1x + 15, frog1y + 11, 1, 3);
	g.fillRect (frog1x + 17, frog1y + 17, 1, 4);
	g.fillRect (frog1x + 23, frog1y + 17, 1, 4);
	g.fillRect (frog1x + 2, frog1y + 19, 1, 4);
    }


    public void frogmove ()
    {
	if ((myX >= frog1x - 200) && (myX <= frog1x + 226) && (myY >= frog1y - 200) && (myY <= frog1y + 230)) //frog detect
	{
	    if ((myX >= frog1x) && (myX <= frog1x + 26) && (myY <= frog1y + 100)) //up
		frog1y = frog1y + 6;
	    else if ((myX >= frog1x) && (myX <= frog1x + 26) && (myY >= frog1y + 130)) //down
		frog1y = frog1y - 6;
	    else if ((myY >= frog1y + 100) && (myY <= frog1y + 130) && (myX <= frog1x)) //left
		frog1x = frog1x + 6;
	    else if ((myY >= frog1y + 100) && (myY <= frog1y + 130) && (myX >= frog1x + 26)) //right
		frog1x = frog1x - 6;
	    else if ((myX <= frog1x) && (myY <= frog1y + 100)) //upleft
	    {
		frog1x = frog1x + 4;
		frog1y = frog1y + 4;
	    }
	    else if ((myX <= frog1x) && (myY >= frog1y + 130)) //downleft
	    {
		frog1x = frog1x + 4;
		frog1y = frog1y - 4;
	    }
	    else if ((myX >= frog1x + 26) && (myY <= frog1y + 100)) //upright
	    {
		frog1x = frog1x - 4;
		frog1y = frog1y + 4;
	    }
	    else if ((myX >= frog1x + 26) && (myY >= frog1y + 130)) //downright
	    {
		frog1x = frog1x - 4;
		frog1y = frog1y - 4;
	    }
	}
	else
	{
	    int frog1move = (int) (Math.random () * 9); //frog movement
	    switch (frog1move)
	    {
		case 1:
		    frog1x = frog1x + 8;
		    break;
		case 2:
		    frog1x = frog1x - 8;
		    break;
		case 3:
		    frog1y = frog1y + 8;
		    break;
		case 4:
		    frog1y = frog1y - 8;
		    break;
		case 5:
		    frog1x = frog1x + 6;
		    frog1y = frog1y - 6;
		    break;
		case 6:
		    frog1x = frog1x + 6;
		    frog1y = frog1y + 6;
		    break;
		case 7:
		    frog1x = frog1x - 6;
		    frog1y = frog1y - 6;
		    break;
		case 8:
		    frog1x = frog1x - 6;
		    frog1y = frog1y + 6;
		    break;
	    }
	}
	if (frog1x >= 775) //frog limits
	    frog1x = 775;
	else if (frog1x <= 10)
	    frog1x = 10;

	if (frog1y >= 580)
	    frog1y = 580;
	else if (frog1y <= 15)
	    frog1y = 15;
    }


    public void enemymove ()
    {
	for (int r = 0 ; r <= 2 ; r++)
	{
	    if ((myX > enemyx [r] - enemyrange [r]) && (myX < enemyx [r] + enemyrange [r] + enemysize [r]) && (myY > enemyy [r] - enemyrange [r]) && (myY < enemyy [r] + enemyrange [r] + enemysize [r])) //enemy detect
	    {
		if ((myX >= enemyx [r] + 5) && (myX <= enemyx [r] + enemysize [r] - 5) && (myY <= enemyy [r] + 5)) //up
		    enemyy [r] = enemyy [r] - enemystr1 [r];
		else if ((myX >= enemyx [r] + 5) && (myX <= enemyx [r] + enemysize [r] - 5) && (myY >= enemyy [r] + enemysize [r] - 5)) //down
		    enemyy [r] = enemyy [r] + enemystr1 [r];
		else if ((myY >= enemyy [r] + 5) && (myY <= enemyy [r] + enemysize [r] - 5) && (myX <= enemyx [r] - 5)) //left
		    enemyx [r] = enemyx [r] - enemystr1 [r];
		else if ((myY >= enemyy [r] + 5) && (myY <= enemyy [r] + enemysize [r] - 5) && (myX >= enemyx [r] + enemysize [r] - 5)) //right
		    enemyx [r] = enemyx [r] + enemystr1 [r];
		else if ((myX <= enemyx [r] + 5) && (myY <= enemyy [r] + 5)) //upleft
		{
		    enemyx [r] = enemyx [r] - enemydiag1 [r];
		    enemyy [r] = enemyy [r] - enemydiag1 [r];
		}
		else if ((myX <= enemyx [r]) && (myY >= enemyy [r] + enemysize [r] - 5)) //downleft
		{
		    enemyx [r] = enemyx [r] - enemydiag1 [r];
		    enemyy [r] = enemyy [r] + enemydiag1 [r];
		}
		else if ((myX >= enemyx [r] + enemysize [r] - 5) && (myY <= enemyy [r] + 5)) //upright
		{
		    enemyx [r] = enemyx [r] + enemydiag1 [r];
		    enemyy [r] = enemyy [r] - enemydiag1 [r];
		}
		else if ((myX >= enemyx [r] + enemysize [r] - 5) && (myY >= enemyy [r] + enemysize [r] - 5)) //downright
		{
		    enemyx [r] = enemyx [r] + enemydiag1 [r];
		    enemyy [r] = enemyy [r] + enemydiag1 [r];
		}
	    }
	    else
	    {
		int enemymove = (int) (Math.random () * 9); //enemy movement
		switch (enemymove)
		{
		    case 1:
			enemyx [r] = enemyx [r] + enemystr2 [r];
			break;
		    case 2:
			enemyx [r] = enemyx [r] + enemystr2 [r];
			break;
		    case 3:
			enemyx [r] = enemyx [r] - enemystr2 [r];
			break;
		    case 4:
			enemyx [r] = enemyx [r] - enemystr2 [r];
			break;
		    case 5:
			enemyx [r] = enemyx [r] + enemydiag2 [r];
			enemyy [r] = enemyy [r] - enemydiag2 [r];
			break;
		    case 6:
			enemyx [r] = enemyx [r] + enemydiag2 [r];
			enemyy [r] = enemyy [r] + enemydiag2 [r];
			break;
		    case 7:
			enemyx [r] = enemyx [r] - enemydiag2 [r];
			enemyy [r] = enemyy [r] - enemydiag2 [r];
			break;
		    case 8:
			enemyx [r] = enemyx [r] - enemydiag2 [r];
			enemyy [r] = enemyy [r] + enemydiag2 [r];
			break;
		}
	    }

	    if (enemyx [r] >= 775) //enemy x limits
		enemyx [r] = 770;
	    else if (enemyx [r] <= 0)
		enemyx [r] = 5;

	    if (enemyy [r] >= 675) //enemy y limits
		enemyy [r] = 670;
	    else if (enemyy [r] <= 100)
		enemyy [r] = 105;

	}
    }


    public void drawenemy1 (Graphics g)
    {
	g.setColor (df); // dark flower part

	g.fillRect (enemyx [0] + 2 * 2, enemyy [0] + 4 * 2, 9 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 3 * 2, enemyy [0] + 5 * 2, 6 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 3 * 2, enemyy [0] + 6 * 2, 4 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 3 * 2, enemyy [0] + 7 * 2, 6 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 3 * 2, enemyy [0] + 17 * 2, 8 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 4 * 2, enemyy [0] + 8 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 4 * 2, enemyy [0] + 13 * 2, 1 * 2, 5 * 2);
	g.fillRect (enemyx [0] + 5 * 2, enemyy [0] + 9 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 5 * 2, enemyy [0] + 12 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 5 * 2, enemyy [0] + 15 * 2, 1 * 2, 3 * 2);
	g.fillRect (enemyx [0] + 6 * 2, enemyy [0] + 10 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 6 * 2, enemyy [0] + 14 * 2, 1 * 2, 4 * 2);
	g.fillRect (enemyx [0] + 7 * 2, enemyy [0] + 11 * 2, 5 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 7 * 2, enemyy [0] + 15 * 2, 1 * 2, 3 * 2);
	g.fillRect (enemyx [0] + 8 * 2, enemyy [0] + 14 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 10 * 2, enemyy [0] + 16 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 11 * 2, enemyy [0] + 5 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 12 * 2, enemyy [0] + 5 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 12 * 2, enemyy [0] + 11 * 2, 1 * 2, 5 * 2);
	g.fillRect (enemyx [0] + 13 * 2, enemyy [0] + 7 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 14 * 2, enemyy [0] + 7 * 2, 1 * 2, 3 * 2);
	g.fillRect (enemyx [0] + 15 * 2, enemyy [0] + 5 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 15 * 2, enemyy [0] + 9 * 2, 5 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 16 * 2, enemyy [0] + 4 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 18 * 2, enemyy [0] + 3 * 2, 5 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 19 * 2, enemyy [0] + 5 * 2, 4 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 20 * 2, enemyy [0] + 2 * 2, 3 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 20 * 2, enemyy [0] + 4 * 2, 3 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 20 * 2, enemyy [0] + 6 * 2, 3 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 20 * 2, enemyy [0] + 8 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 21 * 2, enemyy [0] + 7 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 22 * 2, enemyy [0] + 1 * 2, 1 * 2, 1 * 2);

	g.setColor (lf); // light flower part

	g.fillRect (enemyx [0] + 5 * 2, enemyy [0] + 8 * 2, 8 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 5 * 2, enemyy [0] + 10 * 2, 7 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 5 * 2, enemyy [0] + 11 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 6 * 2, enemyy [0] + 9 * 2, 8 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 6 * 2, enemyy [0] + 12 * 2, 6 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 7 * 2, enemyy [0] + 6 * 2, 5 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 7 * 2, enemyy [0] + 8 * 2, 7 * 2, 3 * 2);
	g.fillRect (enemyx [0] + 7 * 2, enemyy [0] + 12 * 2, 5 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 7 * 2, enemyy [0] + 14 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 8 * 2, enemyy [0] + 16 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 9 * 2, enemyy [0] + 7 * 2, 4 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 9 * 2, enemyy [0] + 14 * 2, 3 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 15 * 2, enemyy [0] + 7 * 2, 5 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 16 * 2, enemyy [0] + 5 * 2, 3 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 18 * 2, enemyy [0] + 4 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 19 * 2, enemyy [0] + 6 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 20 * 2, enemyy [0] + 7 * 2, 1 * 2, 1 * 2);

	g.setColor (Color.yellow); // yellow

	g.fillRect (enemyx [0] + 13 * 2, enemyy [0] + 10 * 2, 2 * 2, 2 * 2);

	g.setColor (blob); // blob colour

	g.fillRect (enemyx [0] + 3 * 2, enemyy [0] + 25 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 4 * 2, enemyy [0] + 24 * 2, 10 * 2, 4 * 2);
	g.fillRect (enemyx [0] + 6 * 2, enemyy [0] + 23 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 7 * 2, enemyy [0] + 18 * 2, 30 * 2, 10 * 2); // big piece
	g.fillRect (enemyx [0] + 8 * 2, enemyy [0] + 28 * 2, 10 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 9 * 2, enemyy [0] + 29 * 2, 10 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 10 * 2, enemyy [0] + 30 * 2, 10 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 11 * 2, enemyy [0] + 18 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 11 * 2, enemyy [0] + 31 * 2, 10 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 12 * 2, enemyy [0] + 17 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 12 * 2, enemyy [0] + 32 * 2, 10 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 13 * 2, enemyy [0] + 12 * 2, 30 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 13 * 2, enemyy [0] + 14 * 2, 31 * 2, 14 * 2);
	g.fillRect (enemyx [0] + 13 * 2, enemyy [0] + 12 * 2, 28 * 2, 22 * 2); // face area
	g.fillRect (enemyx [0] + 14 * 2, enemyy [0] + 33 * 2, 25 * 2, 1 * 2); // same row as darker blob spots
	g.fillRect (enemyx [0] + 14 * 2, enemyy [0] + 35 * 2, 27 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 14 * 2, enemyy [0] + 36 * 2, 10 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 15 * 2, enemyy [0] + 10 * 2, 27 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 15 * 2, enemyy [0] + 34 * 2, 25 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 15 * 2, enemyy [0] + 37 * 2, 8 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 20 * 2, enemyy [0] + 9 * 2, 21 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 22 * 2, enemyy [0] + 8 * 2, 18 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 23 * 2, enemyy [0] + 6 * 2, 12 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 23 * 2, enemyy [0] + 7 * 2, 15 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 31 * 2, enemyy [0] + 36 * 2, 10 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 32 * 2, enemyy [0] + 37 * 2, 8 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 40 * 2, enemyy [0] + 28 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 40 * 2, enemyy [0] + 31 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 41 * 2, enemyy [0] + 29 * 2, 1 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 42 * 2, enemyy [0] + 28 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 43 * 2, enemyy [0] + 27 * 2, 5 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 44 * 2, enemyy [0] + 25 * 2, 5 * 2, 2 * 2);
	g.fillRect (enemyx [0] + 44 * 2, enemyy [0] + 24 * 2, 4 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 44 * 2, enemyy [0] + 23 * 2, 1 * 2, 1 * 2);

	g.setColor (Color.black);

	g.fillRect (enemyx [0] + 18 * 2, enemyy [0] + 14 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 18 * 2, enemyy [0] + 20 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 19 * 2, enemyy [0] + 15 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 19 * 2, enemyy [0] + 19 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 21 * 2, enemyy [0] + 16 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 21 * 2, enemyy [0] + 18 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 23 * 2, enemyy [0] + 17 * 2, 1 * 2, 1 * 2);

	g.fillRect (enemyx [0] + 26 * 2, enemyy [0] + 23 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 27 * 2, enemyy [0] + 22 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 28 * 2, enemyy [0] + 23 * 2, 1 * 2, 1 * 2);

	g.fillRect (enemyx [0] + 30 * 2, enemyy [0] + 17 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 31 * 2, enemyy [0] + 16 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 31 * 2, enemyy [0] + 18 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 33 * 2, enemyy [0] + 15 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 33 * 2, enemyy [0] + 19 * 2, 2 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 35 * 2, enemyy [0] + 14 * 2, 1 * 2, 1 * 2);
	g.fillRect (enemyx [0] + 35 * 2, enemyy [0] + 20 * 2, 1 * 2, 1 * 2);
    }


    public void drawenemy2 (Graphics g)
    {
	enemyx [1] = enemyx [1] - 5;
	enemyy [1] = enemyy [1] - 5;

	g.setColor (pinku); // pink

	g.fillRect (enemyx [1] + 1, enemyy [1] + 32, 22, 7);
	g.fillRect (enemyx [1] + 2, enemyy [1] + 25, 22, 16);
	g.fillRect (enemyx [1] + 2, enemyy [1] + 40, 54, 3);
	g.fillRect (enemyx [1] + 3, enemyy [1] + 24, 52, 1);
	g.fillRect (enemyx [1] + 3, enemyy [1] + 43, 53, 2);
	g.fillRect (enemyx [1] + 3, enemyy [1] + 44, 52, 1);
	g.fillRect (enemyx [1] + 4, enemyy [1] + 23, 51, 1);
	g.fillRect (enemyx [1] + 4, enemyy [1] + 45, 50, 1);
	g.fillRect (enemyx [1] + 5, enemyy [1] + 22, 50, 1);
	g.fillRect (enemyx [1] + 5, enemyy [1] + 46, 49, 2);
	g.fillRect (enemyx [1] + 6, enemyy [1] + 48, 47, 1);
	g.fillRect (enemyx [1] + 8, enemyy [1] + 21, 47, 1);
	g.fillRect (enemyx [1] + 8, enemyy [1] + 49, 44, 1);
	g.fillRect (enemyx [1] + 9, enemyy [1] + 19, 44, 2);
	g.fillRect (enemyx [1] + 11, enemyy [1] + 18, 42, 1);
	g.fillRect (enemyx [1] + 12, enemyy [1] + 17, 40, 1);
	g.fillRect (enemyx [1] + 13, enemyy [1] + 16, 37, 1);
	g.fillRect (enemyx [1] + 13, enemyy [1] + 50, 36, 1);
	g.fillRect (enemyx [1] + 14, enemyy [1] + 16, 17, 1);
	g.fillRect (enemyx [1] + 15, enemyy [1] + 15, 12, 1);
	g.fillRect (enemyx [1] + 19, enemyy [1] + 44, 27, 1);
	g.fillRect (enemyx [1] + 23, enemyy [1] + 44, 21, 1);
	g.fillRect (enemyx [1] + 24, enemyy [1] + 25, 31, 15);
	g.fillRect (enemyx [1] + 24, enemyy [1] + 51, 18, 1);
	g.fillRect (enemyx [1] + 27, enemyy [1] + 52, 12, 1);

	g.fillRect (enemyx [1] + 38, enemyy [1] + 15, 11, 1);
	g.fillRect (enemyx [1] + 43, enemyy [1] + 16, 4, 1);

	g.fillRect (enemyx [1] + 53, enemyy [1] + 19, 1, 1);
	g.fillRect (enemyx [1] + 53, enemyy [1] + 24, 1, 1);
	g.fillRect (enemyx [1] + 53, enemyy [1] + 25, 1, 1);

	g.fillRect (enemyx [1] + 54, enemyy [1] + 33, 1, 6);
	g.fillRect (enemyx [1] + 55, enemyy [1] + 35, 1, 4);

	g.setColor (otherleaf); // leaf

	g.fillRect (enemyx [1] + 7, enemyy [1] + 1, 1, 2);
	g.fillRect (enemyx [1] + 8, enemyy [1] + 2, 12, 3);
	g.fillRect (enemyx [1] + 9, enemyy [1] + 5, 1, 1);
	g.fillRect (enemyx [1] + 10, enemyy [1] + 5, 17, 2);
	g.fillRect (enemyx [1] + 11, enemyy [1] + 6, 1, 1);
	g.fillRect (enemyx [1] + 12, enemyy [1] + 6, 17, 3);
	g.fillRect (enemyx [1] + 14, enemyy [1] + 9, 2, 1);
	g.fillRect (enemyx [1] + 16, enemyy [1] + 9, 11, 2);
	g.fillRect (enemyx [1] + 20, enemyy [1] + 3, 3, 2);
	g.fillRect (enemyx [1] + 23, enemyy [1] + 4, 3, 1);
	g.fillRect (enemyx [1] + 27, enemyy [1] + 9, 1, 1);
	g.fillRect (enemyx [1] + 28, enemyy [1] + 6, 1, 1);
	g.fillRect (enemyx [1] + 29, enemyy [1] + 9, 1, 6);


	g.setColor (Color.black); // eyes

	g.fillRect (enemyx [1] + 24, enemyy [1] + 28, 1, 5);
	g.fillRect (enemyx [1] + 33, enemyy [1] + 28, 1, 5);

	enemyx [1] = enemyx [1] + 5;
	enemyy [1] = enemyy [1] + 5;
    }


    public void drawenemy3 (Graphics g)
    {
	g.setColor (dy); // dark yellow parts
	g.fillRect (enemyx [2] + 1, enemyy [2] + 13, 1, 6);
	g.fillRect (enemyx [2] + 2, enemyy [2] + 5, 1, 8);
	g.fillRect (enemyx [2] + 2, enemyy [2] + 18, 1, 2);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 3, 1, 2);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 6, 1, 2);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 11, 1, 2);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 19, 1, 2);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 3, 1, 1);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 6, 1, 1);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 12, 1, 2);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 20, 1, 1);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 2, 1, 1);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 6, 1, 2);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 13, 1, 2);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 20, 1, 2);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 2, 1, 1);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 7, 1, 1);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 14, 1, 2);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 21, 1, 1);
	g.fillRect (enemyx [2] + 7, enemyy [2] + 1, 1, 2);
	g.fillRect (enemyx [2] + 7, enemyy [2] + 7, 1, 1);
	g.fillRect (enemyx [2] + 7, enemyy [2] + 15, 1, 2);
	g.fillRect (enemyx [2] + 7, enemyy [2] + 22, 1, 1);
	g.fillRect (enemyx [2] + 8, enemyy [2] + 1, 1, 5);
	g.fillRect (enemyx [2] + 8, enemyy [2] + 8, 1, 1);
	g.fillRect (enemyx [2] + 8, enemyy [2] + 15, 1, 2);
	g.fillRect (enemyx [2] + 8, enemyy [2] + 22, 1, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 1, 1, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 3, 1, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 5, 1, 3);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 9, 1, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 16, 1, 2);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 22, 1, 1);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 1, 1, 1);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 7, 1, 3);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 17, 1, 2);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 23, 1, 1);
	g.fillRect (enemyx [2] + 11, enemyy [2] + 1, 1, 1);
	g.fillRect (enemyx [2] + 11, enemyy [2] + 9, 1, 2);
	g.fillRect (enemyx [2] + 11, enemyy [2] + 18, 1, 2);
	g.fillRect (enemyx [2] + 11, enemyy [2] + 23, 1, 1);
	g.fillRect (enemyx [2] + 12, enemyy [2] + 1, 1, 1);
	g.fillRect (enemyx [2] + 12, enemyy [2] + 11, 1, 1);
	g.fillRect (enemyx [2] + 12, enemyy [2] + 19, 1, 2);
	g.fillRect (enemyx [2] + 12, enemyy [2] + 23, 1, 2);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 2, 1, 1);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 13, 1, 5);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 20, 1, 3);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 24, 1, 1);
	g.fillRect (enemyx [2] + 14, enemyy [2] + 2, 1, 1);
	g.fillRect (enemyx [2] + 14, enemyy [2] + 6, 1, 3);
	g.fillRect (enemyx [2] + 14, enemyy [2] + 22, 1, 4);
	g.fillRect (enemyx [2] + 15, enemyy [2] + 3, 1, 4);
	g.fillRect (enemyx [2] + 15, enemyy [2] + 13, 1, 2);
	g.fillRect (enemyx [2] + 15, enemyy [2] + 23, 1, 3);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 2, 1, 2);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 5, 1, 1);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 14, 1, 2);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 22, 1, 3);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 1, 1, 2);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 5, 1, 1);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 12, 1, 2);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 15, 1, 1);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 20, 1, 2);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 24, 1, 1);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 1, 1, 1);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 6, 1, 2);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 10, 1, 2);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 16, 1, 6);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 24, 1, 1);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 1, 1, 1);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 8, 1, 3);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 18, 1, 2);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 24, 1, 1);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 1, 4, 1);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 8, 1, 2);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 16, 2, 2);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 18, 1, 1);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 24, 2, 1);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 15, 2, 1);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 23, 2, 1);
	g.fillRect (enemyx [2] + 22, enemyy [2] + 7, 1, 1);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 2, 1, 2);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 5, 1, 2);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 14, 2, 1);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 22, 2, 1);
	g.fillRect (enemyx [2] + 24, enemyy [2] + 3, 1, 1);
	g.fillRect (enemyx [2] + 24, enemyy [2] + 5, 2, 1);
	g.fillRect (enemyx [2] + 24, enemyy [2] + 6, 1, 1);
	g.fillRect (enemyx [2] + 24, enemyy [2] + 13, 3, 1);
	g.fillRect (enemyx [2] + 24, enemyy [2] + 26, 2, 1);
	g.fillRect (enemyx [2] + 25, enemyy [2] + 20, 2, 1);
	g.fillRect (enemyx [2] + 26, enemyy [2] + 4, 2, 1);
	g.fillRect (enemyx [2] + 26, enemyy [2] + 12, 1, 1);
	g.fillRect (enemyx [2] + 26, enemyy [2] + 18, 1, 2);
	g.fillRect (enemyx [2] + 27, enemyy [2] + 7, 1, 5);
	g.fillRect (enemyx [2] + 27, enemyy [2] + 14, 1, 5);

	g.setColor (ly); // light yellow
	g.fillRect (enemyx [2] + 2, enemyy [2] + 14, 3, 4);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 5, 1, 1);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 8, 5, 3);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 13, 1, 1);
	g.fillRect (enemyx [2] + 3, enemyy [2] + 18, 1, 1);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 4, 4, 2);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 7, 1, 1);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 11, 8, 1);
	g.fillRect (enemyx [2] + 4, enemyy [2] + 14, 1, 6);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 3, 3, 1);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 12, 2, 1);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 15, 1, 1);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 16, 2, 1);
	g.fillRect (enemyx [2] + 5, enemyy [2] + 17, 4, 3);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 6, 3, 1);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 13, 9, 1);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 20, 1, 1);
	g.fillRect (enemyx [2] + 7, enemyy [2] + 14, 1, 1);
	g.fillRect (enemyx [2] + 7, enemyy [2] + 20, 5, 2);
	g.fillRect (enemyx [2] + 8, enemyy [2] + 7, 1, 1);
	g.fillRect (enemyx [2] + 8, enemyy [2] + 9, 1, 2);
	g.fillRect (enemyx [2] + 8, enemyy [2] + 14, 1, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 2, 4, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 4, 6, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 8, 1, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 10, 2, 1);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 14, 6, 2);
	g.fillRect (enemyx [2] + 9, enemyy [2] + 18, 1, 2);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 3, 5, 1);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 5, 4, 2);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 16, 8, 1);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 19, 1, 1);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 22, 1, 1);
	g.fillRect (enemyx [2] + 11, enemyy [2] + 7, 2, 2);
	g.fillRect (enemyx [2] + 11, enemyy [2] + 17, 1, 1);
	g.fillRect (enemyx [2] + 11, enemyy [2] + 22, 1, 1);
	g.fillRect (enemyx [2] + 12, enemyy [2] + 9, 2, 1);
	g.fillRect (enemyx [2] + 12, enemyy [2] + 17, 1, 2);
	g.fillRect (enemyx [2] + 12, enemyy [2] + 21, 1, 2);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 7, 1, 1);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 17, 1, 3);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 23, 1, 1);
	g.fillRect (enemyx [2] + 14, enemyy [2] + 5, 1, 1);
	g.fillRect (enemyx [2] + 14, enemyy [2] + 9, 3, 4);
	g.fillRect (enemyx [2] + 14, enemyy [2] + 18, 3, 4);
	g.fillRect (enemyx [2] + 15, enemyy [2] + 7, 3, 5);
	g.fillRect (enemyx [2] + 15, enemyy [2] + 15, 1, 1);
	g.fillRect (enemyx [2] + 15, enemyy [2] + 22, 1, 1);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 4, 7, 1);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 6, 2, 1);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 13, 1, 1);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 3, 5, 1);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 14, 6, 1);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 17, 3, 1);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 22, 1, 2);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 2, 5, 1);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 5, 2, 1);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 8, 1, 2);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 2, 5, 1);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 13, 3, 3);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 22, 3, 2);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 6, 1, 1);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 1, 8, 1);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 16, 1, 2);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 20, 5, 2);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 10, 7, 1);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 19, 6, 1);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 7, 1, 1);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 9, 4, 1);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 13, 3, 1);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 18, 5, 1);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 22, 2, 1);
	g.fillRect (enemyx [2] + 22, enemyy [2] + 5, 1, 2);
	g.fillRect (enemyx [2] + 22, enemyy [2] + 16, 5, 2);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 7, 4, 1);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 12, 3, 1);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 15, 4, 1);
	g.fillRect (enemyx [2] + 24, enemyy [2] + 20, 1, 1);
	g.fillRect (enemyx [2] + 25, enemyy [2] + 6, 1, 1);
	g.fillRect (enemyx [2] + 25, enemyy [2] + 14, 2, 1);
	g.fillRect (enemyx [2] + 26, enemyy [2] + 8, 1, 2);

	g.setColor (leaf); // leaf
	g.fillRect (enemyx [2] + 3, enemyy [2] + 23, 7, 3);
	g.fillRect (enemyx [2] + 6, enemyy [2] + 26, 7, 2);
	g.fillRect (enemyx [2] + 10, enemyy [2] + 24, 2, 1);
	g.fillRect (enemyx [2] + 13, enemyy [2] + 25, 1, 1);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 25, 1, 1);
	g.fillRect (enemyx [2] + 16, enemyy [2] + 25, 1, 1);
	g.fillRect (enemyx [2] + 17, enemyy [2] + 25, 9, 2);
	g.fillRect (enemyx [2] + 22, enemyy [2] + 24, 1, 1);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 23, 3, 2);
	g.fillRect (enemyx [2] + 26, enemyy [2] + 24, 1, 2);

	g.setColor (Color.black); // black
	g.fillRect (enemyx [2] + 7, enemyy [2] + 12, 6, 1);
	g.fillRect (enemyx [2] + 14, enemyy [2] + 17, 3, 1);
	g.fillRect (enemyx [2] + 18, enemyy [2] + 12, 5, 1);
	g.fillRect (enemyx [2] + 19, enemyy [2] + 7, 2, 1);
	g.fillRect (enemyx [2] + 20, enemyy [2] + 5, 2, 2);
	g.fillRect (enemyx [2] + 21, enemyy [2] + 8, 5, 1);
	g.fillRect (enemyx [2] + 22, enemyy [2] + 3, 1, 1);
	g.fillRect (enemyx [2] + 23, enemyy [2] + 4, 3, 1);
	g.fillRect (enemyx [2] + 25, enemyy [2] + 3, 1, 1);
	g.fillRect (enemyx [2] + 25, enemyy [2] + 9, 1, 1);
	g.fillRect (enemyx [2] + 25, enemyy [2] + 3, 1, 1);
	g.fillRect (enemyx [2] + 26, enemyy [2] + 5, 2, 2);
    }


    public void drawplayer (Graphics g)
    {
	myX = myX - 16;
	myY = myY - 26;

	g.setColor(body); // space grey
	
	g.fillRect(myX+1*2,myY+4*2,1*2,6*2);
	g.fillRect(myX+2*2,myY+3*2,1*2,3*2);
	g.fillRect(myX+2*2,myY+9*2,1*2,2*2);
	g.fillRect(myX+3*2,myY+2*2,1*2,2*2);
	g.fillRect(myX+3*2,myY+11*2,2*2,1*2);
	g.fillRect(myX+3*2,myY+15*2,1*2,1*2);
	g.fillRect(myX+4*2,myY+1*2,8*2,1*2);
	g.fillRect(myX+4*2,myY+2*2,1*2,1*2);
	g.fillRect(myX+4*2,myY+13*2,1*2,1*2);
	g.fillRect(myX+5*2,myY+12*2,6*2,1*2);
	g.fillRect(myX+5*2,myY+14*2,6*2,3*2);
	g.fillRect(myX+5*2,myY+19*2,6*2,2*2);
	g.fillRect(myX+5*2,myY+21*2,2*2,1*2);
	g.fillRect(myX+9*2,myY+21*2,2*2,1*2);
	g.fillRect(myX+11*2,myY+2*2,2*2,1*2);
	g.fillRect(myX+11*2,myY+11*2,2*2,1*2);
	g.fillRect(myX+11*2,myY+13*2,1*2,1*2);
	g.fillRect(myX+12*2,myY+3*2,2*2,1*2);
	g.fillRect(myX+12*2,myY+15*2,1*2,1*2);
	g.fillRect(myX+13*2,myY+4*2,1*2,2*2);
	g.fillRect(myX+13*2,myY+9*2,1*2,2*2);
	g.fillRect(myX+14*2,myY+4*2,1*2,6*2);
	
	g.setColor(visor); // helmet grey
	
	g.fillRect(myX+2*2,myY+6*2,1*2,3*2);
	g.fillRect(myX+3*2,myY+4*2,1*2,2*2);
	g.fillRect(myX+3*2,myY+8*2,1*2,3*2);
	g.fillRect(myX+4*2,myY+3*2,1*2,2*2);
	g.fillRect(myX+4*2,myY+7*2,1*2,4*2);
	g.fillRect(myX+5*2,myY+2*2,1*2,2*2);
	g.fillRect(myX+5*2,myY+5*2,1*2,7*2);
	g.fillRect(myX+5*2,myY+17*2,2*2,2*2);
	g.fillRect(myX+6*2,myY+2*2,5*2,10*2);
	g.fillRect(myX+9*2,myY+17*2,2*2,2*2);
	g.fillRect(myX+11*2,myY+3*2,1*2,8*2);
	g.fillRect(myX+12*2,myY+4*2,1*2,7*2);
	g.fillRect(myX+13*2,myY+6*2,1*2,3*2);
	
	g.setColor(Color.black); // black
	
	g.fillRect(myX+1*2,myY+17*2,1*2,2*2);
	g.fillRect(myX+2*2,myY+13*2,1*2,4*2);
	g.fillRect(myX+2*2,myY+19*2,2*2,1*2);
	g.fillRect(myX+3*2,myY+12*2,1*2,2*2);
	g.fillRect(myX+3*2,myY+16*2,1*2,1*2);
	g.fillRect(myX+4*2,myY+12*2,1*2,1*2);
	g.fillRect(myX+4*2,myY+14*2,1*2,8*2);
	g.fillRect(myX+5*2,myY+13*2,6*2,1*2);
	g.fillRect(myX+7*2,myY+21*2,2*2,1*2);
	g.fillRect(myX+11*2,myY+12*2,1*2,1*2);
	g.fillRect(myX+11*2,myY+14*2,1*2,8*2);
	g.fillRect(myX+12*2,myY+12*2,1*2,2*2);
	g.fillRect(myX+12*2,myY+16*2,1*2,1*2);
	g.fillRect(myX+12*2,myY+19*2,2*2,1*2);
	g.fillRect(myX+13*2,myY+13*2,1*2,4*2);
	g.fillRect(myX+14*2,myY+17*2,1*2,2*2);
	
	g.setColor(p); // peach
	
	g.fillRect(myX+2*2,myY+17*2,2*2,2*2);
	g.fillRect(myX+12*2,myY+17*2,2*2,2*2);
	
	g.setColor(shg); // shoe grey
	
	g.fillRect(myX+5*2,myY+22*2,2*2,1*2);
	g.fillRect(myX+9*2,myY+22*2,2*2,1*2);
	
	// COLOUR OPTIONS*************
	
	g.setColor(opt1); // pink
	// g.setColor(opt2); // cyan

	g.fillRect(myX+3*2,myY+14*2,1*2,1*2);
	g.fillRect(myX+7*2,myY+17*2,2*2,2*2);
	g.fillRect(myX+12*2,myY+14*2,1*2,1*2);

	myX = myX + 16;
	myY = myY + 26;
    }


    public void rock1 (Graphics g)
    {
	int rock1x = 105;
	int rock1y = 565;

	g.setColor (rock); // rock colour

	g.fillRect (rock1x + 75, rock1y + 1, 25, 5);
	g.fillRect (rock1x + 50, rock1y + 5, 70, 5);
	g.fillRect (rock1x + 35, rock1y + 10, 95, 7);
	g.fillRect (rock1x + 22, rock1y + 17, 115, 8);
	g.fillRect (rock1x + 15, rock1y + 25, 125, 7);
	g.fillRect (rock1x + 10, rock1y + 32, 133, 10);
	g.fillRect (rock1x + 7, rock1y + 42, 138, 5);
	g.fillRect (rock1x + 5, rock1y + 47, 142, 8);
	g.fillRect (rock1x + 4, rock1y + 55, 144, 14);
	g.fillRect (rock1x + 6, rock1y + 69, 140, 7);
	g.fillRect (rock1x + 10, rock1y + 76, 132, 4);
	g.fillRect (rock1x + 15, rock1y + 80, 122, 3);
	g.fillRect (rock1x + 24, rock1y + 83, 110, 3);
	g.fillRect (rock1x + 40, rock1y + 86, 86, 2);
	g.fillRect (rock1x + 58, rock1y + 88, 62, 3);
    }


    public void rock2 (Graphics g)
    {
	int rock2x = 565;
	int rock2y = 515;

	g.setColor (rock); // rock colour

	g.fillRect (rock2x + 75, rock2y + 1, 25, 5);
	g.fillRect (rock2x + 50, rock2y + 5, 70, 5);
	g.fillRect (rock2x + 35, rock2y + 10, 95, 7);
	g.fillRect (rock2x + 22, rock2y + 17, 115, 8);
	g.fillRect (rock2x + 15, rock2y + 25, 125, 7);
	g.fillRect (rock2x + 10, rock2y + 32, 133, 10);
	g.fillRect (rock2x + 7, rock2y + 42, 138, 5);
	g.fillRect (rock2x + 5, rock2y + 47, 142, 8);
	g.fillRect (rock2x + 4, rock2y + 55, 144, 14);
	g.fillRect (rock2x + 6, rock2y + 69, 140, 7);
	g.fillRect (rock2x + 10, rock2y + 76, 132, 4);
	g.fillRect (rock2x + 15, rock2y + 80, 122, 3);
	g.fillRect (rock2x + 24, rock2y + 83, 110, 3);
	g.fillRect (rock2x + 40, rock2y + 86, 86, 2);
	g.fillRect (rock2x + 58, rock2y + 88, 62, 3);
    }


    public void rock3 (Graphics g)
    {
	int rock3x = 155;
	int rock3y = 365;

	g.setColor (rock); // rock colour

	g.fillRect (rock3x + 75, rock3y + 1, 25, 5);
	g.fillRect (rock3x + 50, rock3y + 5, 70, 5);
	g.fillRect (rock3x + 35, rock3y + 10, 95, 7);
	g.fillRect (rock3x + 22, rock3y + 17, 115, 8);
	g.fillRect (rock3x + 15, rock3y + 25, 125, 7);
	g.fillRect (rock3x + 10, rock3y + 32, 133, 10);
	g.fillRect (rock3x + 7, rock3y + 42, 138, 5);
	g.fillRect (rock3x + 5, rock3y + 47, 142, 8);
	g.fillRect (rock3x + 4, rock3y + 55, 144, 14);
	g.fillRect (rock3x + 6, rock3y + 69, 140, 7);
	g.fillRect (rock3x + 10, rock3y + 76, 132, 4);
	g.fillRect (rock3x + 15, rock3y + 80, 122, 3);
	g.fillRect (rock3x + 24, rock3y + 83, 110, 3);
	g.fillRect (rock3x + 40, rock3y + 86, 86, 2);
	g.fillRect (rock3x + 58, rock3y + 88, 62, 3);
    }


    public void rock4 (Graphics g)
    {
	int rock4x = 455;
	int rock4y = 215;

	g.setColor (rock); // rock colour

	g.fillRect (rock4x + 75, rock4y + 1, 25, 5);
	g.fillRect (rock4x + 50, rock4y + 5, 70, 5);
	g.fillRect (rock4x + 35, rock4y + 10, 95, 7);
	g.fillRect (rock4x + 22, rock4y + 17, 115, 8);
	g.fillRect (rock4x + 15, rock4y + 25, 125, 7);
	g.fillRect (rock4x + 10, rock4y + 32, 133, 10);
	g.fillRect (rock4x + 7, rock4y + 42, 138, 5);
	g.fillRect (rock4x + 5, rock4y + 47, 142, 8);
	g.fillRect (rock4x + 4, rock4y + 55, 144, 14);
	g.fillRect (rock4x + 6, rock4y + 69, 140, 7);
	g.fillRect (rock4x + 10, rock4y + 76, 132, 4);
	g.fillRect (rock4x + 15, rock4y + 80, 122, 3);
	g.fillRect (rock4x + 24, rock4y + 83, 110, 3);
	g.fillRect (rock4x + 40, rock4y + 86, 86, 2);
	g.fillRect (rock4x + 58, rock4y + 88, 62, 3);
    }
}
