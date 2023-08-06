from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.common.exceptions import NoSuchElementException
from msedge.selenium_tools import Edge, EdgeOptions

url = "https://academic.ui.ac.id/"
path = r"C:\Users\Arka Brian\Documents\Arka\Kuliah\UI\BotSiakwar\msedgedriver.exe"

options = EdgeOptions()
options.use_chromium = True
browser_driver = Edge(options=options, executable_path=path)
browser_driver.get(url)

username_field = browser_driver.findElement(By.name("u"))
username_field.send_keys("arka.brian")
username_field = browser_driver.findElement(By.name("p"))
username_field.send_keys("saitamu1304++")
username_field.send_keys(Keys.RETURN)