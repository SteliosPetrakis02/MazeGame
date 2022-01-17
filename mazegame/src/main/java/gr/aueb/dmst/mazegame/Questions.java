package gr.aueb.dmst.mazegame;
public class Questions {
	GamePanel gp;
	Player pl;
	KeyListe key;
	public Questions(GamePanel gp , Player pl,KeyListe key) {
		this.gp = gp;
		this.pl=pl;
		this.key=key;
	}
	String[][] answers={      //table that contains the possible answers for the questions
	        {" Κίρκη "," Καλυψώ ", " Αφροδίτη " },  
	        {" Άρης "," Ήφαιστος ", " Ποσειδώνας " },
	        { "'Ηλιος",  "Ποσειδώνας"," Δίας" }, 
	        {" Δημόδοκος", "Αντίνοος"," Φήμιος "}, 
	        {" τον Κένταυρο","τον Κέρβερο", " τον Ερύμανθο "},
	        {" Αγαμέμνων", "Δαίδαλος","  Αιγέας "},
	        {" Φιλοκτήτης", "Τεύκρος","Πρωτεσίλαος" } ,
	        {"Ιοκάστη ","Ισμήνη ",  "Ελένη "}, 
	        {"Βρισηίδα " ," Χρυσηίδα" , "Ανδρομάχη" }, 
	        {"Προμηθέας ", "Επιμηθάες" ," ΄Ατλας" } , 
	        { "Στην Κνωσσό" , "Στην Τροία", "Στον Εύρωμο" },
	        {" Σε εννέα" ,"Σε πέντε" , "Σε δύο" }, 
	        {"1500-1490 π.Χ " ,"1250-1240 π.Χ ", "1100-1090 π.Χ" }, 
	        {"Στον Ευριτίωνα και τον Όρθρο" ,"Στον Μενοίτιο και τον Άδη" }, 
	        {" Η θεά Ήρα" ,"Η θεά Δήμητρα" , "Η θεά Αφροδίτη" }, 
	        {" Για να φέρουν εις πέρας τρεις άθλους ","Για να πάρουν το χρυσόμαλλο δέρας" , "Ήταν διαταγή του Πελία" },
	        {"Είχε κεφάλι φιδιού, ουρά σκύλου και σώμα κατσίκας " , "Είχε κεφάλι ταύρου, ουρά λιονταριού και σώμα κατσίκας"," Είχε κεφάλι λιονταριού, ουρά φιδιού και σώμα κατσίκας" },
	        {"Στο Ιδαιό Άντρο " ,"Στη Φαιστό " , "Στην Τροία " },
	        {" Τα φίδια" ,"Η τρίαινα" ,"Τα σπαθιά "}, 
	        {"Ο Θησέας", "Ο Ιάσονας","Ο Οδυσσέας" },
		{"Όλυμπος", "Ερύμανθος", "Πίνδος"}, 
	        { "Ιφικλής" , "Αππελής" , "Ετεοκλής"}, 
		{ "Οι Στυμφαλίδες όρνιθες", "Η Λερναία Ύδρα", "Το λιοντάρι της Νεμέας"}, 
		{ "Αριάδνη", "Ανδρομάχη", "Ανδριανή"}, 
		{ "Δίας", "Απόλλωνας", "Ήρα"}, 
		{ "Θησέας", "Ιάσων", "Ίκαρος"}, 
		{ "με ρόπαλο", "με βέλη", "με σπαθί"}, 
		{ "Της Αυλίδας","Του Ναυπλίου" , "Του Βόλου"}, 
		{ "η Ιωλκός", "Αργώ", "Γοργώ"}, 
		{ "Ιδομενέας", "Αίαντας","Νέστορας"}, 
		{ "Αππόλων", "Πλούτωνας", "Ερμής"},
		{ "Θησέας", "Ορφέας", "Ιάσονας"}, 
		{"Λητώ", "Δανάη", "Αντιόπη"}, 
		{"Ηρακλής", "Οδυσσέας", "Οιδίποδας"}, 
		{"Άρτεμις", "Λητώ", "Ήρα"}, 
		{"λιοντάρια","αγελάδες", "γουρούνια"}, 
		{"Δίας", "Απόλλων", "Ερμής"},
		{"Φρίξος", "Ναύπλιος", "Άργος"},
		{"Αίγισθο", "Έκτορα", "Πάρη"}, 
		{"Ουρανός", "Άτλαντας", "Κρόνος"}, 
		{"Κύκλωπες", "Γίγαντες", "Τιτάνες"}, 
		{"1", "7", "3"}, 
		{"Ταύρος", "Βοσκός", "Σύννεφο"},	
		{"Ποσειδώνας", "Διόνυσος", "Δίας"}, 
		{"Η Σκύλλα", "Η Χίμαιρα", "Η Χάρυβδη"}, 
		{"Δίας", "Ωκεανός", "Ουρανός"}, 
		{"Αθηνά", "Ήρα", "Αφροδίτη"},  
		{"Περσέας", "Ηρακλής", "Θησέας"}, 
		{"Άφησε ένα περιστέρι να περάσει πρώτα", "Αποφάσισε να περάσει γύρω από αυτές", "Το πλοίο του καταστράφηκε και μόνο αυτός επιβίωσε"},
		{"Εστία", "Εκάτη", "Μηδεία"}, 
		{"Δίας", "Άρης", "Ήφαιστος"}, 
		{"10", "20", "30"}, 
		{"Μεγάλωσε δίπλα στους θεούς.","Η μητέρα του τον βούτηξε στα νερά του ποταμού της Στύγας.", "Έφαγε αμβροσία την τροφή των θεών."},  
		{"Δίδυμοι", "Μικρή και μεγάλη άρκτος", "Μικρός και μεγάλος κύνας"}, 
		{"Χάριτες", "Μούσες", "Νύμφες"}, 
		{"Σίνη", "Σκίρωνα", "Προσκρούστη"}, 
		{"Σε γυναίκα", "Σε φίδι", "Σε άλογο"}, 
		{"Σφίγγα", "Μέδουσα", "Λερναία Ύδρα"}, 
		{"κεφάλι φιδιού", "σώμα λιονταριού", "φτερά πουλιών"}, 
		{"2", "3", "1"}, 
		{"Άρης", "Δίας", "Διόνυσος"},
		{"Περσεφόνη", "Πύρρα", "Πανδώρα"}, 
		{"Έρωτας", "Χάος", "Ουρανός"}, 
		{"Θησέας", "Αχιλλέας", "Οδυσσέας"}, 
		{"Αθηνά", "Άρτεμις", "Αφροδίτη"}, 
		{"Ερμής", "Ποσειδώνας", "Άρης"}, 
		{"Πλούτωνας", "Ποσειδώνας", "Άρης"}, 
		{"Ύδρα", "Έχιδνα", "Σκύλα"}, 
		{"0", "2", "3"},
		
		{"Σε λιβάνι", "Σε δάφνη", "Σε ηλιοτρόπιο"},
                {"Την είχε τιμωρήσει ο Δίας για την ανυπακοή της", "Για να τονίζεται η αμεροληψία της ", "Είχε τραυματιστεί στην Τιτανομαχία"},
                {"Ο Ερμής", "Ο Μορφέας", "Ο Επιμηθέας"},
                {"Είχε σώμα σκύλου, ουρά δράκου και 3 κεφάλια", "Είχε σώμα δράκου, φτερά αετού και 3 κεφάλια", "Είχε σώμα λιονταριού, ουρά δράκου και 3 κεφάλια"},
                {"Επειδή απείλησε να του κλέψει την βασιλεία", "Επειδή τον περιφρόνησε", "Επειδή τον ερωτεύτηκε"},
                {"Τα έφαγε", "Τους έδωσε αξιώματα στο πλάι του", "Τα δολοφόνησε μόλις γεννήθηκαν"},
                {"Γινόταν ψάρι", "Τον έτρωγαν τα φίδια", "Πέτρωνε"},
                {"Ο Αχιλλέας", "Ο Περσέας", "Ο Ποσειδώνας"},
                {"Ο Πολυδεύκης", "Ο Κάστορας", "Η Ερμιόνη"},
                {"Ο Πρωταγόρας", "Ο Πεωτεσίλαος", "Ο Πρώταρχος"},
		
		{"Ήταν σπουδαίος πολεμιστής", "Ήταν πάρα πολύ ψηλός", "Ήταν πάρα πολύ άσχημος"},
                {"Τον δολοφόνησε η Κλυταιμνήστρα και ο εραστής της", "Από φυσικά αίτια", "Μεταμορφώθηκε σε βατράχι και τον έφαγε ο Αχιλλέας"},
                {"Η Μεγάρα", "Η Διηάνειρα", "Η Αλκμήνη"},
                {"Η εποχή των Θεών ή Θεογονία", "Η εποχή Θεών και Ανθρώπων", "Η εποχή των Ηρώων"},
                {"Ο Κρόνος", "Ο Δίας", "Ο Ποσειδώνας"},
                {"Πηγών", "Θαλασσών", "Ποταμών"},
                {"αυτόύς που διέπρατταν εγκλήματα κατά των συγγενών τους", "αυτούς που έδειχναν ασέβεια απέναντι στους θεούς ", "αυτόύς που δεν τηρούσαν τους νόμους"},
                {"Νυμφών", "Μουσών", "Νηρηίδων"},
                {"Διόσκουρους", "Σάτυρους", "Ανθρώπους"},
                {"Η Μήδεια έριξε ένα μαγικό υγρό το οποίο έκλεισα τα μάτια του δράκου", "Ο Ορφέως έπαιξε γλυκά τη λύρα του να αποκοιμηθεί ο δράκος", "Ο ‘Ακαστος τον σκότωσε με τα δηλητηριώδη βέλη του"},

               {"Ο Τάνταλος", "Ο Μαρσύας", "Ο Οβίδιος"},
               {"Στον Κελέο", "Στον τριπτόλεμο", "Στον Λυκούργο"},
               {"Το τόξο και το σπαθί", "Το σπαθί και το ρόπαλο", "Το τόξο και το ρόπαλο"},
               {"Θεός του εμπορίου", "Θεός του στρατού", "Θεός της αρετής"},
               {"Τον μανδύα του", "Το σανδάλι του", "Το τόξο του"},
               {"7ο αι.", "8ο αι.", "9ο αι."},
               {"Ένα πλάσμα βαμπίρ που δάγκωνε τα παιδιά, Σύζυγος του Κένταυρου Χείρωνα", "Βασίλισσα της Λιβύης που έγινε δαίμονας"},
               {"ελάφια", "άλογα", "λιοντάρια"},
               {"φυλή ανθρωποφάγων γιγάντων", "φυλή ανθρωποφάγων πουλιών", "φυλή ανθρωποφάγων τεράτων"},
               {"Σθενώ", "Μέδουσα", "Δεινώ"} 
		
		};
	// ca table contains the position of the correct answer from the answers table
	 int[] ca = { 1, 1, 0, 2, 1, 2, 2, 1, 0, 2, 0, 0, 1, 0, 0, 1, 2, 0, 1, 2, 1, 0, 2, 1, 2, 2, 0, 0, 1, 2, 2, 1, 0, 2, 0, 2, 1, 2, 0, 2, 0, 1, 0, 0, 1, 2, 2, 0, 0, 1, 2, 0, 1, 0, 1, 1, 2, 0, 1, 0, 1, 0, 1, 2, 0, 1, 2, 2, 1, 1, 0, 2, 0, 2, 1, 2, 1, 2, 0, 0, 0, 1, 2, 0, 1, 2, 2, 0, 1, 2, 0, 1, 1, 2, 1, 0 ,2

		     };
	 //qs table contains the questions
	  String[] qs = { "Στο νησί ποιας θεάς φιλοξενήθηκε ο Οδυσσέας για επτά χρόνια καθώς προσπαθούσε να επιστρέψει στην Ιθάκη;" ,
			  "Ποιος θεός φιλοτέχνησε την ασπίδα του Αχιλλέα; ", 
			  "Ποιος θεός οργίστηκε με τον Οδυσσέα και τους συντρόφους του, επειδή του έφαγαν τα ιερά του βόδια;",
			  "Πώς λεγόταν ο αοιδός του παλατιού του Οδυσσέα στην Ιθάκη;",
			  "Ποιο σκυλί ζήτησε ο Ευρυσθέας από τον Ηρακλή να του φέρει από τον Κάτω Κόσμο;",
			  "Πώς λεγόταν ο πατέρας  του Θησέα;","Πώς λεγόταν ο πρώτος Αχαιός πολεμιστής που σκοτώθηκε στην Τροία;",
			  "Ποια ήταν η αδερφή της Αντιγόνης;", "Πώς λεγόταν η σκλάβα του Αχιλλέα την οποία απαίτησε ο Αγαμέμνων να του την πάρει;",
			  "Ποιος ήταν ο Τιτάνας που τιμωρήθηκε από το Δία να φέρει αιώνια στους ώμους του τον ουράνιο θόλο;",
			  "Που ήταν κτισμένο το παλάτι του βασιλιά Μίνωα;","Σε πόσους συνολικά άθλους διακρίθηκε ο Θησέας;",
			  "Σύμφωνα με τον Ηρόδοτο, πότε έγινε ο Τρωικός Πόλεμος;",
			  "Σε ποιους είχε αναθέσει τη φύλαξη των ζώων του ο Γηρυόνης, ο άνθρωπος με τα τρία σώματα;",
			  "Ποια ήταν η βασίλισσα των θεών και των ανθρώπων;","Για ποιον λόγο οργανώθηκε από τον Ιάσονα η Αργοναυτική εκστρατεία",
			  "Πώς έμοιαζε στην όψη μία Χίμαιρα;","Σε ποιο μέρος έκρυψε η Ρέα, τον γιό της Δία προκειμένου να γλιτώσει από τον Κρόνο που έτρωγε τα παιδιά του;",
			  "Ποιο είναι το σύμβολο του θεού Ποσειδώνα ;", "Ποιος ήρθε «αντιμέτωπος» με τις Σειρήνες;",
			  "Σε ποιό βουνό έστειλε ο Ευρυσθέας  τον Ηρακλή για να βρει το αγριογούρουνο;",
			  "Πως λεγόταν ο αδερφός του Ηρακλή;",
			  "Ποιός ήταν ο πρώτος άθλος του Ήρακλη;",
			  "Πως λεγόταν η γυναίκα του Έκτορα;",
			  "Ποιος θεός ήταν με το μέρος των Αχαιών στον πόλεμο της Τροίας;",
			  "Πως λεγόταν ο γιός του Δαιδάλου;",
			  "Πως σκότωσε ο Ηρακλής το λιοντάρι της Νεμέας;",
			  "Από ποιο λιμάνι ξεκίνησαν οι Αχαιοί για την Τροία;",
			  "Πως λεγόταν το πλοίο με το οποίο ο Ιάσονας έφτασε στην Κολχίδα;",
			  "Πως λεγόταν ο σοφός βασιλίας της Πύλου που πήρε μέρος στον Τρωικό πόλεμο;",
			  "Ποιος θεός είχε το προσωνύμιο ψυχοπομπός;",
			  "Ποιος κατέβηκε στον Άδη για να πάρει πίσω τη γυναίκα του, την Ευριδίκη;",
			  "Ο Δίας μεταμορφώθηκε σε κύκνο για να ενωθεί ερωτικά με την:",
			  "Ποιός έλυσε το γρίφο της Σφίγγας;",
			  "Η αδερφή του Απόλλωνα ήταν η:",
			  "Η Κίρκη μεταμόρφωσε τους συντρόφους του Οδυσσέα σε:",
			  "Ο θεός της μαντικής τέχνης ήταν ο:",
			  "Το πιστό σκυλί του Οδυσσέα λεγόταν:",
			  "Ο Αγαμέμνονας φονεύτηκε από τον:",
			  "Ο πατέρας του Δία ήταν ο:",
			  "Ποιοι έδωσαν τον κεραυνό στον Δία;",
			  "Πόσα χρόνια έμεινε ο Οδυσσέας στο νησί της Καλυψούς σύμφωνα με τον Όμηρο;",
			  "Σε τι μεταμορφώθηκε ο Δίας για να συνευρεθεί με την Ευρώπη;",
			  "Ποιος θεός έχει ως ιερό ζώο τα άλογα;",
			  "Ποιο μυθικό τέρας είχε σώμα κατσίκας και κεφάλι λιονταριού;",
			  "Ποια θεότητα συνδέεται με δεσμούς αίματος με την Αφροδίτη;",
			  "Σε ποια θεά έδωσε ο Πάρης το μήλο της Έριδος;",
			  "Ποιος κατάφερε να θανατώσει τη Μέδουσα;",
			  "Πως πέρασε ο Ιάσωνας από τις συμπληγάδες πέτρες;",
			  "Ποια ήταν η θεά της μαγείας;",
			  "Ποιος θεός του Ολύμπου αλυσόδεσε τον Προμηθέα στον Καύκασο;",
			  "Πόσα χρόνια περιπλανήθηκε ο Οδυσσέας πριν φτάσει στην Ιθάκη;",
			  "Πως έγινε ο Αχιλλέας άτρωτος;",
			  "Ποιος αστερισμός αντιπροσωπεύει τους διόσκουροους;",
			  "Η Τερψιχόρη ήταν μια από τις:",
			  "Ποιο ληστή αντιμετώπισε ο Θησέας στην Κακιά Σκάλα;",
			  "Σε τι μεταμορφώθηκε για 7 χρόνια ο μάντης Τειρεσίας;",
			  "Ο Πήγασος γεννήθηκε όταν ποιο μυθικό τέρας έχασε το κεφάλι του;",
			  "Οι Άρπυιες  είχαν:",
			  "Πόσες αδερφές είχε η Μέδουσα;",
			  "Ποιός θεός της αρχαιότητας ήταν <<γυναικάς>>;",
			  "Ποιά χαρακτηρίζεται ως η γιαγιά της ανθρωπότητας;",
			  "Ποιός ήταν ο πατέρας της Γαίας;",
			  "Ποιός ήρωας πήρε μαζί του την πριγκίπισσα Αριάδνη φεύγοντας από την Κρήτη και την εγκατέλειψε στην Νάξο;",
			  "Ποιά θέα δολοφόνησε 6 από τις κόρες την Νιόβης επειδή προσέλαβαν την μητέρα της;",
			  "Ποιός θεός υπάκουε πίστα στις εντολές της Αθήνας;",
			  "Ποιος θεός κυβερνούσε τον κάτω κόσμο;",
			  "Ποιά ήταν η μητέρα των τεράτων;",
			  "Πόσα παιδιά είχε η Αφροδίτη;",
				  
		           "Σε ποιο φυτό μεταμόρφωσε ο θεός Ήλιος την αγαπημένη του Λευκοθόη, περιχύνοντας τη με αμβροσία;",
                           "Γιατί η Θέμις, η θεά της Δικαιοσύνης είναι τυφλή και κρατά ζυγαριά και σπαθί;",
                           "Ποιος ήταν ο θεός των Ονείρων;",
                           "Πως έμοιαζε στην όψη το μυθικό τέρας του Άδη, ο Κέρβερος;",
                           "Για ποιο λόγο ο Δίας μεταμορφώθηκε σε αετό και άρπαξε τον Γανυμήδη;",
                           "Πώς αντιμετώπισε ο Τιτάνας Κρόνος τα παιδιά του;",
                           "Τι συνέβαινε σε όποιον κοιτούσε την Μέδουσα στο πρόσωπο;",
                           "Ποιος κατάφερε να θανατώσει τελικά τη Μέδουσα;",
                           "Ποιος/α από τους παρακάτω δεν ήταν αδερφός/η της ωραίας Ελένης;",
                           "Ποιος ήταν ο πρώτος νεκρός του Τρωικού Πολέμου;",

                           "Για ποια ιδιότητά του ήταν γνωστός ο Θερσίτης;",
                           "Πώς πέθανε ο βασιλιάς Αγαμέμνονας;",
                           "Ποια ήταν η πρώτη σύζυγος του Ηρακλή;",
                           "Ποια είναι η πρώτη περίοδος της  μυθολογική ιστορία του κόσμου:",
                           "Ποιος ελευθέρωσε τους Τιτάνες από τα Τάρταρα;",
                           "Οι νύμφες ήταν πνεύματα των: ",
                           "Οι Ερινύες  τιμωρούσαν : ",
                           "Ο Απόλλωνας ήταν ηγέτης των: ",
                           "Ο Προμηθέας κλέβει τη φωτιά για να τη δώσει στους: ",
                           "Τι δεν έγινε για να μπορέσει ο Ιάσωνας να πάρει το Χρυσόμαλλο Δέρας από το δράκο που το φύλαγε:",

                           "Ποιος έκλεψε το νέκταρ και την αμβροσία από το τραπέζι του Δία;",
                           "Σε ποιον διδάσκει τη Γεωργία και τα Μυστήρια η Δήμητρα;",
                           "Τα χαρακτηριστικά όπλα του Ηρακλή ήταν:",
                           "Στην Ιταλία ο Ηρακλής λατρευόταν ως:",
                           "Τι χάνει ο Ιάσων διασχίζοντας τον ποταμό Άναυρο;",
                           "Ο Όμηρος έζησε τον:",
                           "Η Λάμια ήταν:",
                           "Οι κένταυροι ήταν πλάσματα με  ανθρώπινο άνω κορμό ενώ από τη μέση και κάτω ήταν:",
                           "Οι Λαιστρυγόνες ήταν:",
                           "Ποια από τις πιο κάτω δεν είναι γοργόνα;"

                               };

	  
	    public void  startQuestions(int n){  //int arguement n is the number of the question that will be asked to the player
			
			Questions_Frame questions = new Questions_Frame(qs[n],answers[n],ca[n],pl,gp,key,gp.ui);
			questions.setVisible(true); 
	      	questions.playq();
			

	       
	    
	    }
}
