from tkinter import *
# Here I am importing the entire tkinter module. 
from tkinter.ttk import *

from time import strftime
# Importing time from system via strftime

root = Tk()
root.title("Digital Clock")
# Creating the window and assigning it a title

def time():
    string = strftime("%H:%M:%S %p")
    lbl.config(text = string)
    lbl.after(1000, time)

# Defining a time function so I can display the time on the label

lbl = Label(root, font = ("calibri", 40, "bold"), background = "white", foreground = "blue")
# Styling the label widget so that way it looks more aesthetically appealing. 
# font = () I am using to set the font, size and styling(italic, bold, etc)
# background for setting background color
# foreground for setting foreground color
# do note regardless of the color on my MacBook the background will always be white no matter what color I set it to. 

lbl.pack(anchor = "center")
time()
# placing the clock at the center of the tkinter window
mainloop()




