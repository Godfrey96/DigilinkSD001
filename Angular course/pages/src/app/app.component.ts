import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  currentPage = 0;

  images = [
    {
      title: 'At the Beach',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Dollspointbeach.png/220px-Dollspointbeach.png'
    },
    {
      title: 'The Palm Tree',
      url: 'https://upload.wikimedia.org/wikipedia/commons/0/07/Palmtreesil.jpg'
    },
    {
      title: 'VW T-Roc',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg/1024px-Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg'
    },
    {
      title: 'Boat Cruise',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg/800px-Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg'
    },
    {
      title: 'At the Beach',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Dollspointbeach.png/220px-Dollspointbeach.png'
    },
    {
      title: 'The Palm Tree',
      url: 'https://upload.wikimedia.org/wikipedia/commons/0/07/Palmtreesil.jpg'
    },
    {
      title: 'VW T-Roc',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg/1024px-Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg'
    },
    {
      title: 'Boat Cruise',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg/800px-Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg'
    },
    {
      title: 'At the Beach',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Dollspointbeach.png/220px-Dollspointbeach.png'
    },
    {
      title: 'The Palm Tree',
      url: 'https://upload.wikimedia.org/wikipedia/commons/0/07/Palmtreesil.jpg'
    },
    {
      title: 'VW T-Roc',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg/1024px-Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg'
    },
    {
      title: 'Boat Cruise',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg/800px-Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg'
    },
    {
      title: 'At the Beach',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Dollspointbeach.png/220px-Dollspointbeach.png'
    },
    {
      title: 'The Palm Tree',
      url: 'https://upload.wikimedia.org/wikipedia/commons/0/07/Palmtreesil.jpg'
    },
    {
      title: 'VW T-Roc',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg/1024px-Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg'
    },
    {
      title: 'Boat Cruise',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg/800px-Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg'
    },
    {
      title: 'At the Beach',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Dollspointbeach.png/220px-Dollspointbeach.png'
    },
    {
      title: 'The Palm Tree',
      url: 'https://upload.wikimedia.org/wikipedia/commons/0/07/Palmtreesil.jpg'
    },
    {
      title: 'VW T-Roc',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg/1024px-Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg'
    },
    {
      title: 'Boat Cruise',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg/800px-Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg'
    },
    {
      title: 'At the Beach',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Dollspointbeach.png/220px-Dollspointbeach.png'
    },
    {
      title: 'The Palm Tree',
      url: 'https://upload.wikimedia.org/wikipedia/commons/0/07/Palmtreesil.jpg'
    },
    {
      title: 'VW T-Roc',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg/1024px-Volkswagen_T-Roc_R_%282021%29_1X7A0297.jpg'
    },
    {
      title: 'Boat Cruise',
      url: 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg/800px-Queen_Elizabeth_Kreuzfahrtschiff_%28203664459%29.jpeg'
    }
  ];

  checkWindowIndex(index: number) {
    return Math.abs(this.currentPage - index) < 5;
  }

}
