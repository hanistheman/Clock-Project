from tkinter import *
# Here I am importing the entire tkinter module. 
from tkinter.ttk import *

from time import strftime
# Importing time from system via strftime

from datetime import date 
# Importing date from system via datetime library

root = Tk()
root.title("Digital Clock")
root.geometry("900x720")
# Creating the window and assigning it a title along with setting the dimensions(in this case, 900 x 720)

def time():
    string = strftime("%I:%M:%S %p")
    lbl.config(text = string)
    lbl.after(1000, time)

# Defining a time function so I can display the time on the label
def todaysDate():
    today = strftime("%B %d, %Y")
    todaysDatelbl.config(text = today)
# Defining a function to display today's date on the label.   
    
lbl = Label(root, font = ("calibri", 128, "bold"), background = "white", foreground = "blue")
lbl.pack(pady = 20)
# Styling the label widget so that way it looks more aesthetically appealing. 
# font = () I am using to set the font, size and styling(italic, bold, etc)
# background for setting background color
# foreground for setting foreground color
# do note regardless of the color on my MacBook the background will always be white no matter what color I set it to. 

todaysDatelbl = Label(root, font = ("calibri", 128, "bold"), background = "white", foreground = "black")
todaysDatelbl.pack()
# Doing something similar for the time label, but doing it for the date. 
lbl.pack(anchor = "center")
todaysDatelbl.pack(anchor = "center")

todaysDate()
time()
# placing the clock at the center of the tkinter window
root.mainloop()