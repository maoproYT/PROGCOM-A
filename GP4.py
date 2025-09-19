import turtle
t = turtle.Turtle()
t.speed(0)
s = turtle.Screen()
s.bgcolor('#262626')
t.pencolor('magenta')
col = ('cyan', 'yellow', 'red')
for colors in range(4):
    for times in range(9):
        t.speed(times + 10)
        for i in range(2):
            t.pensize(13)
            t.circle(80 + colors * 20, 90)
            t.left(90)
        t.left(45)
    t.pencolor(col[colors % 3])


t.penup()
t.goto(0, -250)
t.pendown()
t.pensize(13)
t.pencolor("white")
t.goto(0, 0)

t.penup()
t.goto(250, -270)  
t.setheading(0)    
t.pencolor("white")
t.write("mao", align="center", font=("Arial", 20, "bold"))
t.hideturtle()  
s.exitonclick()
turtle.done()
