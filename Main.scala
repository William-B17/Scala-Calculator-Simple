import scala.math._
import io.AnsiColor._

@main def hello(): Unit = 
  print(s"""
${RED}1 ${WHITE}:${GREEN} Calculator${WHITE}
${RED}2 ${WHITE}:${GREEN} Combinations${WHITE}

${RED}Choose a method ${WHITE}: ${GREEN}""")
  print(f"${WHITE}")
  val inputmain = scala.io.StdIn.readLine()
  println(s"\n${RED}valg ${WHITE}: ${GREEN}" + inputmain + s"${WHITE}")
  if (inputmain == "1") {
    Calculator()
  } else if (inputmain == "2") {
    Combosx()
  }
  def Combosx(): Unit = {
    var a:Int = 8;
    var b:Int = 8;
    var days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ) // change if you want i didn't feel like making a input
    val numList = List(1,2,3,4,5,6,7,8,9,10,11,12); // change if you want i didn't feel like making a input
    for(a <- numList; m1 <- days) {
      println(s"${BOLD}${RED}id : ${GREEN}${a}\n${RED}name : ${GREEN}${m1}\n${WHITE}");
    }
    print(s"This is every combination of ${RED}" + numList + s"${WHITE} and every day of the week. This means that we have printed every day of 12 weeks (3 months)\n")
}
  def Calculator(): Unit = {
    print(s"""
${RED}1 ${WHITE}:${GREEN} Addition ${WHITE}
${RED}2 ${WHITE}:${GREEN} Subtraction ${WHITE}
${RED}3 ${WHITE}:${GREEN} Multiplication ${WHITE}
${RED}4 ${WHITE}:${GREEN} Division ${WHITE}
${RED}5 ${WHITE}:${GREEN} Square Root ${WHITE} 
${RED}6 ${WHITE}:${GREEN} Pythagoras ${WHITE}

${RED}Choose a method ${WHITE}: ${GREEN}""")
      print(f"${WHITE}")
      val inputz = scala.io.StdIn.readLine()
      println(s"\n${RED}valg ${WHITE}: ${GREEN}" + inputz + s"${WHITE}")
      if (inputz == "1") {
        Numbers("1")
      } else if (inputz == "2") {
        Numbers("2")
      } else if (inputz == "3") {
        Numbers("3")
      } else if (inputz == "4") {
        Numbers("4")
      } else if (inputz == "5") {
        Numbers("5")
      } else if (inputz == "6") {
        Numbers("6")
      } else {
        print("ups")
      }

    def Numbers(typex:String): Unit = {
      if (typex == "6") {
        print(s"""
${RED}1 ${WHITE}:${GREEN} Side (${RED}A${GREEN}) ${WHITE}
${RED}2 ${WHITE}:${GREEN} Side (${RED}B${GREEN}) ${WHITE}
${RED}3 ${WHITE}:${GREEN} Side (${RED}C${GREEN}) ${WHITE}

${RED}Choose a method ${WHITE}: ${GREEN}""")
        print(f"${WHITE}")  
        val pyinput = scala.io.StdIn.readLine()
        println(s"\n${RED}valg ${WHITE}: ${GREEN}" + pyinput + s"${WHITE}\n")
        if (pyinput == "1") {
          print(s"${RED}Write the length of side (${GREEN}C${RED}) ${WHITE}: ")
          val c = scala.io.StdIn.readLine()
          print(s"${RED}Write the length of side (${GREEN}B${RED}) ${WHITE}: ")
          val b = scala.io.StdIn.readLine()
          var b2:Int = b.toInt * b.toInt
          var c2:Int = c.toInt * c.toInt
          var cmb:Int = c2 - b2
          println(s"""     ${RED}_______
${GREEN}A ${WHITE}= ${RED}√c2 ${WHITE}- ${RED}b2

${GREEN}c ${WHITE}= ${RED}${c.toInt}

${GREEN}b ${WHITE}= ${RED}${b.toInt}

${GREEN}c2 ${WHITE}= ${RED}${c.toInt} ${WHITE}* ${RED}${c.toInt}
${GREEN}b2 ${WHITE}= ${RED}${b.toInt} ${WHITE}* ${RED}${b.toInt}

${GREEN}c2 ${WHITE}= ${RED}${c2}
${GREEN}b2 ${WHITE}= ${RED}${b2}

${RED}c2 ${WHITE}- ${RED}b2 ${WHITE}= ${GREEN}${cmb}
${RED} _______
${RED}√${cmb} ${WHITE}= ${GREEN}${sqrt(cmb)}

${RED}=====
 ${GREEN}A ${WHITE}= ${GREEN}${sqrt(cmb)}
${RED}=====${WHITE}""")
          reset()
        } else if (pyinput == "2") {
          print(s"${RED}Write the length of side (${GREEN}C${RED}) ${WHITE}: ")
          val c = scala.io.StdIn.readLine()
          print(s"${RED}Write the length of side (${GREEN}A${RED}) ${WHITE}: ")
          val a = scala.io.StdIn.readLine()
          var a2:Int = a.toInt * a.toInt
          var c2:Int = c.toInt * c.toInt
          var cma:Int = c2 - a2
          println(s"""     ${RED}_______
${GREEN}B ${WHITE}= ${RED}√c2 ${WHITE}- ${RED}a2

${GREEN}c ${WHITE}= ${RED}${c.toInt}

${GREEN}a ${WHITE}= ${RED}${a.toInt}

${GREEN}c2 ${WHITE}= ${RED}${c.toInt} ${WHITE}* ${RED}${c.toInt}
${GREEN}a2 ${WHITE}= ${RED}${a.toInt} ${WHITE}* ${RED}${a.toInt}

${GREEN}c2 ${WHITE}= ${RED}${c2}
${GREEN}a2 ${WHITE}= ${RED}${a2}

${RED}c2 ${WHITE}- ${RED}a2 ${WHITE}= ${GREEN}${cma}
${RED} _______
${RED}√${cma} ${WHITE}= ${GREEN}${sqrt(cma)}

${RED}=====
 ${GREEN}B ${WHITE}= ${GREEN}${sqrt(cma)}
${RED}=====${WHITE}""")
          reset()
        } else if (pyinput == "3") {
          print(s"${RED}Write the length of side (${GREEN}A${RED}) ${WHITE}: ")
          val a = scala.io.StdIn.readLine()
          print(s"${RED}Write the length of side (${GREEN}B${RED}) ${WHITE}: ")
          val b = scala.io.StdIn.readLine()
          var a2:Int = a.toInt * a.toInt
          var b2:Int = b.toInt * b.toInt
          var apb:Int = a2 + b2
          println(s"""     ${RED}_______
${GREEN}C ${WHITE}= ${RED}√a2 ${WHITE}+ ${RED}b2

${GREEN}a ${WHITE}= ${RED}${a.toInt}

${GREEN}b ${WHITE}= ${RED}${b.toInt}

${GREEN}a2 ${WHITE}= ${RED}${a.toInt} ${WHITE}* ${RED}${a.toInt}
${GREEN}b2 ${WHITE}= ${RED}${b.toInt} ${WHITE}* ${RED}${b.toInt}

${GREEN}a2 ${WHITE}= ${RED}${a2}
${GREEN}b2 ${WHITE}= ${RED}${b2}

${RED}a2 ${WHITE}+ ${RED}b2 ${WHITE}= ${GREEN}${apb}
${RED} _______
${RED}√${apb} ${WHITE}= ${GREEN}${sqrt(apb)}

${RED}=====
 ${GREEN}C ${WHITE}= ${GREEN}${sqrt(apb)}
${RED}=====${WHITE}""")
          reset()
        }
      }
      else if (typex == "1" || typex == "2" || typex == "3" || typex == "4") {
        print(s"${RED}Write number (${GREEN}1${RED}) ${WHITE}: ")
        val inputy = scala.io.StdIn.readLine()
        print(s"${RED}Write number (${GREEN}2${RED}) ${WHITE}: ")
        val inputx = scala.io.StdIn.readLine()
        if (typex == "1") {
          var z:Int = inputy.toInt + inputx.toInt
          var v:String = s"${GREEN} " + inputy.toString + s" ${RED}+ ${GREEN}" + inputx.toString + s" ${RED}= ${GREEN}" + z.toString + s"\n${WHITE}"
          println(v:String)
          reset()
        } else if (typex == "2") {
          var z:Int = inputy.toInt - inputx.toInt
          var v:String = s"${GREEN} " + inputy.toString + s" ${RED}- ${GREEN}" + inputx.toString + s" ${RED}= ${GREEN}" + z.toString + s"\n${WHITE}"
          println(v:String)
          reset()
        } else if (typex == "3") {
          var z:Int = inputy.toInt * inputx.toInt
          var v:String = s"${GREEN} " + inputy.toString + s" ${RED}* ${GREEN}" + inputx.toString + s" ${RED}= ${GREEN}" + z.toString + s"\n${WHITE}"
          println(v:String)
          reset()
        } else if (typex == "4") {
          var z:Int = inputy.toInt / inputx.toInt
          var v:String = s"${GREEN} " + inputy.toString + s" ${RED}/ ${GREEN}" + inputx.toString + s" ${RED}= ${GREEN}" + z.toString + s"\n${WHITE}"
          println(v:String)
          reset()
        }
      } else if (typex == "5") {
        print(s"${RED}Write a number ${WHITE}: ")
        val inputx = scala.io.StdIn.readLine()
        var z:Int = inputx.toInt
        println(s"${WHITE}The square root of ${RED}√" + inputx + s" = " + s"${sqrt(z)}${WHITE}")
      }
    }

    def clscr: App = {
      object Cls extends App {print("\u001b[2J")}
      Cls
    }

    def reset() : Unit = {
      print(s"""
${RED}1 ${WHITE}:${GREEN} Calculate again${WHITE}
${RED}2 ${WHITE}:${GREEN} Close scala calculator${WHITE}

${RED}Choose a method ${WHITE}: ${GREEN}""")
      print(f"${WHITE}")
      val quz = scala.io.StdIn.readLine()
      if (quz == "1") {
        clscr
        hello()
      } else {
        sys.exit(0)
      }
    }
  }